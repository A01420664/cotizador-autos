package com.API.cotizador.repositories;

import com.API.cotizador.models.RangosAutos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangosAutosRepository extends MongoRepository<RangosAutos, Integer> {
}
