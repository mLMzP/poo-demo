package com.lm2a.heritage.polimorfismo2;

public class Ciudadano extends Persona {

    private String dni;

    public Ciudadano(String nombre, String dni) {
        super(nombre);
        this.dni = dni;
    }

    @Override
    public String getDocumento() {
        return super.getDocumento() + dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
