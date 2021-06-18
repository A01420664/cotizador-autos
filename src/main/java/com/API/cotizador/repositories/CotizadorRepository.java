package com.API.cotizador.repositories;

import com.API.cotizador.models.AltaCotizacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotizadorRepository extends MongoRepository<AltaCotizacion, String> {
}
