package com.lm2a.solid.i_ko;

public class Buitre implements IAve {


    @Override
    public void volar() {
        System.out.println("Buitre volando");
    }

    @Override
    public void comer() {
        System.out.println("Buitre comiendo");
    }

    @Override
    public void nadar() {

    }
}
