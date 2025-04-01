package com.lm2a.interfaces.ejemplo;

public class Juguera implements Preciable{
    private String marca;
    private int cm3;
    private double precio;

    public Juguera(String marca, int cm3, double precio) {
        this.marca = marca;
        this.cm3 = cm3;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getCm3() {
        return cm3;
    }
}
