package com.API.cotizador.services;

import com.API.cotizador.models.Autos;
import com.API.cotizador.models.RangosAutos;
import com.API.cotizador.repositories.RangosAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RangosAutosService {
    @Autowired
    RangosAutosRepository rangosAutosRepository;

    public Optional<RangosAutos> getAutosByRango(Integer rango){
       return this.rangosAutosRepository.findById(rango);
    }

    public Autos buscarAutoId(Integer id){
        List<RangosAutos> rangos = this.rangosAutosRepository.findAll();
        for(RangosAutos r: rangos) {
            for(Autos a : r.getAutos()) {
                if(a.getId() == id) return a;
            }
        }
        return null;

    }

}
