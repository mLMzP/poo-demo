package com.lm2a.heritage.polimorfismo2;

public class Turista extends Persona {

    private String pasaporte;

    public Turista(String nombre, String pasaporte) {
        super(nombre);
        this.pasaporte = pasaporte;
    }

    public String getDocumento() {
        return super.getDocumento() + pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
}
