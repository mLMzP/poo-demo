package com.lm2a.solid.i_ok;

public class Buitre implements IAve, IAveVoladora {


    @Override
    public void volar() {
        System.out.println("Buitre volando");
    }

    @Override
    public void comer() {
        System.out.println("Buitre comiendo");
    }

}
