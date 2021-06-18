package com.API.cotizador.controllers;

import com.API.cotizador.models.RangosAutos;
import com.API.cotizador.services.RangosAutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("${url.base}")
@CrossOrigin
public class RangosAutosController {
    @Autowired
    RangosAutosService rangosAutosService;

    @GetMapping("/rangos/{idRango}/autos")
    public Optional<RangosAutos> getAutosPorId(@PathVariable("idRango") Integer idRango){
        return this.rangosAutosService.getAutosByRango(idRango);
    }
}
