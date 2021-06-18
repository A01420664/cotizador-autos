package com.API.cotizador.repositories;

import com.API.cotizador.models.Rango;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangosRepository extends MongoRepository<Rango, String> {
}
