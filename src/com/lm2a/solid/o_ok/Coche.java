package com.lm2a.solid.o_ok;

public abstract class Coche {
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    abstract int precioMedioCoche();
}
