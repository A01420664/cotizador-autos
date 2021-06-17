package com.API.cotizador.controllers;


import com.API.cotizador.models.Rango;
import com.API.cotizador.services.RangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${url.base}")
@CrossOrigin
public class RangosController {
    @Autowired
    RangoService rangoService ;

    //Obtiene todos los rangos
    @GetMapping("/rangos")
    public List<Rango> getRangos(){
        return this.rangoService.findAll();
    }

}
