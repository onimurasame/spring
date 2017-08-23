package com.example.demo.dto;

public class Moto {
    private String patente;
    private String marca;
    private Integer cc;

    public Moto(String patente, String marca, Integer cc) {
        this.patente = patente;
        this.marca = marca;
        this.cc = cc;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCc() {
        return cc;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", cc=" + cc +
                '}';
    }
}
