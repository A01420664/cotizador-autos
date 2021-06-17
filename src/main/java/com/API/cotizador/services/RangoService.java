package com.API.cotizador.services;

import com.API.cotizador.collections.RangoCollection;
import com.API.cotizador.models.Rango;
import com.API.cotizador.repositories.RangosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RangoService {

    @Autowired
    RangosRepository rangosRepository;

    public List<Rango> findAll(){
        List<Rango> rangoList = new ArrayList<>();
        List<RangoCollection> rangoCollectionList = this.rangosRepository.findAll();
        for(RangoCollection rc :rangoCollectionList){
            Rango rango = new Rango();
            rango.setRango(rc.getRango());
            rango.setMin(rc.getMin());
            rango.setMax(rc.getMax());
            rangoList.add(rango);
        }
        return rangoList;
    }

    public Optional<RangoCollection> findById(String id){
        return rangosRepository.findById(id);
    }

    public RangoCollection save(RangoCollection entity) {
        return rangosRepository.save(entity);
    }

    public boolean delete(RangoCollection entity){
        try {
            rangosRepository.delete(entity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

