package com.lm2a.solid.l_ok;

public class Main {

    public static void main(String[] args) {

        Adulto tutorCarlitos = new Adulto("Carlos", "Perez", "1234567Q", "123432156788765");
        Niño carlitos = new Niño("Carlos", "Perez", tutorCarlitos);

        carlitos.pagar();
    }
}
