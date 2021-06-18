package com.API.cotizador.controllers;


import com.API.cotizador.models.AltaCotizacion;
import com.API.cotizador.models.Autos;
import com.API.cotizador.models.Cotizacion;
import com.API.cotizador.services.CotizadorService;
import com.API.cotizador.services.RangosAutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${url.base}")
@CrossOrigin
public class CotizadorController {
    @Autowired
    CotizadorService cotizadorService;

    @Autowired
    RangosAutosService rangosAutosService;

    @GetMapping("/cotizacion")
    public Cotizacion getCotizacion(@RequestParam("id") Integer id,
                                    @RequestParam("enganche") double enganche,
                                    @RequestParam("meses") Integer meses){
        Autos auto = this.rangosAutosService.buscarAutoId(id);
        return cotizadorService.calcularCotizacion(enganche, meses, auto);
    }

    @GetMapping("/cotizaciones")
    public List<AltaCotizacion> getCotizacionesPorNombre(@RequestParam("nombre")String nombre){
        return this.cotizadorService.getCotizacionesPorNombre(nombre);
    }

    @PostMapping("/cotizacion")
    public ResponseEntity agregarCotizacion(@RequestBody AltaCotizacion cotizacion){
        cotizadorService.agregarCotizacion(cotizacion);
        return new ResponseEntity("Cotizacion creada correctamente", HttpStatus.OK);
    }
}
