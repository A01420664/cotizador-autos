package com.API.cotizador.services;

import com.API.cotizador.collections.AutosCollection;
import com.API.cotizador.collections.RangosAutosCollection;
import com.API.cotizador.models.Auto;
import com.API.cotizador.models.RangosAutos;
import com.API.cotizador.repositories.RangosAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RangosAutosService {
    @Autowired
    RangosAutosRepository rangosAutosRepository;

    public Optional<RangosAutosCollection> getAutosByRango(Integer rango){
       return this.rangosAutosRepository.findById(rango);
    }
}
