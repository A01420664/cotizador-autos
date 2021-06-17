package com.API.cotizador.collections;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rangos")
public class RangoCollection {
    @Id
    @NotNull
    private String id;
    private Integer rango;
    private Integer min;
    private Integer max;

    public RangoCollection() {
    }

    public RangoCollection(@NotNull String id, Integer rango, Integer min, Integer max) {
        this.id = id;
        this.rango = rango;
        this.min = min;
        this.max = max;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRango() {
        return rango;
    }

    public void setRango(Integer rango) {
        this.rango = rango;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
