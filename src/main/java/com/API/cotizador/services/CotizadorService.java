package com.API.cotizador.services;

import com.API.cotizador.models.AltaCotizacion;
import com.API.cotizador.models.Autos;
import com.API.cotizador.models.ConsultaCotizacion;
import com.API.cotizador.models.EntradaCotizacion;
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

    public ConsultaCotizacion calcularCotizacion(Double enganche, Integer meses, Autos auto){
        ConsultaCotizacion cotizacion = new ConsultaCotizacion();
        cotizacion.setCapital(redondeo(auto.getPrecio() - enganche));
        cotizacion.setIntereses(redondeo(cotizacion.getCapital() * calcularTasaTotal(5.0, 11.0)));
        cotizacion.setTotal(redondeo(cotizacion.getCapital()+cotizacion.getIntereses()));
        cotizacion.setMeses(meses);
        cotizacion.setMensualidad(redondeo(cotizacion.getTotal()/meses));
        cotizacion.setTasa(11);

        return cotizacion;
    }

    public AltaCotizacion agregarCotizacion(EntradaCotizacion entradaCotizacion, Autos auto){
        AltaCotizacion cotizacion=new AltaCotizacion();
        cotizacion.setNombre(entradaCotizacion.getNombre());
        cotizacion.setMarca(auto.getMarca());
        cotizacion.setModelo(auto.getModelo());
        cotizacion.setAnno(auto.getAño());
        cotizacion.setPrecio(auto.getPrecio());
        cotizacion.setEnganche(entradaCotizacion.getEnganche());
        cotizacion.setCapital(entradaCotizacion.getCapital());
        cotizacion.setIntereses(entradaCotizacion.getIntereses());
        cotizacion.setTotal(entradaCotizacion.getTotal());
        cotizacion.setMeses(entradaCotizacion.getMeses());
        cotizacion.setMensualidad(entradaCotizacion.getMensualidad());
        cotizacion.setTasa(entradaCotizacion.getTasa());
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

    public Double redondeo(Double cantidad){return Math.round(cantidad*100.0)/100.0;}
}

