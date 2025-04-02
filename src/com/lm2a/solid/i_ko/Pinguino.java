package com.lm2a.solid.i_ko;

public class Pinguino implements IAve{


    @Override
    public void volar() {
        throw new RuntimeException("Los pinguinos no  vuelan");
    }

    @Override
    public void comer() {
        System.out.println("Pinguino comiendo");
    }

    @Override
    public void nadar() {

    }
}
