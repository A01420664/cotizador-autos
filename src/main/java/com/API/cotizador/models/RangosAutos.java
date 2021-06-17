package com.API.cotizador.models;

import com.API.cotizador.collections.AutosCollection;

import java.util.List;

public class RangosAutos {
    private Integer rango;

    private List<AutosCollection> autos;

    public Integer getRango() {
        return rango;
    }

    public void setRango(Integer rango) {
        this.rango = rango;
    }

    public List<AutosCollection> getAutos() {
        return autos;
    }

    public void setAutos(List<AutosCollection> autos) {
        this.autos = autos;
    }
}
