package com.API.cotizador.controllers;

import com.API.cotizador.models.Cotizacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("${url.base}")
@CrossOrigin
public class CotizadorController {

    @GetMapping("/cotizacion")
    public Cotizacion getCotizacion(@RequestParam("enganche") double enganche,
                                    @RequestParam("meses") Integer meses){
    Cotizacion cot = new Cotizacion();
    cot.setCapital(enganche);
    return cot;

    }





}
