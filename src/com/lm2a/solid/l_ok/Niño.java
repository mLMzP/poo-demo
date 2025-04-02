package com.lm2a.solid.l_ok;

public class Niño extends Persona {

    private Adulto tutor;

    public Niño(String nombre, String apellido, Adulto tutor) {
        super(nombre, apellido, null, null);
        this.tutor = tutor;
    }

    public Adulto getTutor() {
        return tutor;
    }

    public void setTutor(Adulto tutor) {
        this.tutor = tutor;
    }

    @Override
    public void pagar() {
        tutor.pagar();
    }
}
