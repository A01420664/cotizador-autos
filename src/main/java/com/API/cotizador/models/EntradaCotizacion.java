package com.API.cotizador.models;

public class EntradaCotizacion {

    private Integer id;
    private String nombre;
    private Double enganche;
    private Double capital;
    private Double intereses;
    private Double total;
    private Integer meses;
    private Double mensualidad;
    private Integer tasa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEnganche() {
        return enganche;
    }

    public void setEnganche(Double enganche) {
        this.enganche = enganche;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getIntereses() {
        return intereses;
    }

    public void setIntereses(Double intereses) {
        this.intereses = intereses;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Integer getTasa() {
        return tasa;
    }

    public void setTasa(Integer tasa) {
        this.tasa = tasa;
    }





}
