package com.lm2a.interfaces.ejemplo;

public class Tostadora implements Preciable {

    private String marca;
    private double precio;

    public Tostadora(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
}
