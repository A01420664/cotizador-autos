package com.API.cotizador.services;

import com.API.cotizador.models.AltaCotizacion;
import com.API.cotizador.models.Autos;
import com.API.cotizador.models.Cotizacion;
import com.API.cotizador.repositories.CotizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CotizadorService {
    @Autowired
    CotizadorRepository cotizadorRepository;

    @Autowired
    MongoOperations mongoOperations;

    public Cotizacion calcularCotizacion(Double enganche, Integer meses, Autos auto){
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setCapital(auto.getPrecio() - enganche);
        cotizacion.setIntereses(cotizacion.getCapital() * calcularTasaTotal(5.0, 11.0));
        cotizacion.setTotal(cotizacion.getCapital()+cotizacion.getIntereses());
        cotizacion.setMeses(meses);
        cotizacion.setMensualidad(cotizacion.getTotal()/meses);
        cotizacion.setTasa(11);

        return cotizacion;
    }

    public AltaCotizacion agregarCotizacion(AltaCotizacion cotizacion){
        return this.cotizadorRepository.save(cotizacion);
    }

    public List<AltaCotizacion> getCotizacionesPorNombre(String nombre){
        Query query = new Query();
        query.addCriteria(Criteria.where("nombre").is(nombre));
        List<AltaCotizacion> cotizaciones = mongoOperations.find(query, AltaCotizacion.class);
        return cotizaciones;
    }

    public Double calcularTasaTotal(Double años, Double tasa){
        return  (años * tasa)/100;
    }
}
