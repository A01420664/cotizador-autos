package com.API.cotizador.models;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rangos_autos")
public class RangosAutos {
    @Id
    @NotNull
    private Integer id;

    private List<Autos> autos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Autos> getAutos() {
        return autos;
    }

    public void setAutos(List<Autos> autos) {
        this.autos = autos;
    }
}
