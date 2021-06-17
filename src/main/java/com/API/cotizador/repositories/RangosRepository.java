package com.API.cotizador.repositories;

import com.API.cotizador.collections.RangoCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangosRepository extends MongoRepository<RangoCollection, String> {
}
