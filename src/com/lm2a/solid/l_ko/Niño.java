package com.lm2a.solid.l_ko;

public class Niño extends Persona {

    public Niño(String nombre, String apellido) {
        super(nombre, apellido, null, null);
    }

    @Override
    public void pagar() {
        throw new RuntimeException("Los niños no pagan.");
    }
}
