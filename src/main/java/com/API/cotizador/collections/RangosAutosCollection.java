package com.API.cotizador.collections;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "rangos_autos")
public class RangosAutosCollection {
    @Id
    @NotNull
    private Integer id;

    private List<AutosCollection> autos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<AutosCollection> getAutos() {
        return autos;
    }

    public void setAutos(List<AutosCollection> autos) {
        this.autos = autos;
    }
}
