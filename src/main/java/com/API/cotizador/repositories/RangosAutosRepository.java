package com.API.cotizador.repositories;

import com.API.cotizador.collections.RangosAutosCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangosAutosRepository extends MongoRepository<RangosAutosCollection, Integer> {
}
