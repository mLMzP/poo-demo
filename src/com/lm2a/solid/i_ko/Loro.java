package com.lm2a.solid.i_ko;

public class Loro implements IAve{
    @Override
    public void volar() {
        System.out.println("Loro volando");
    }

    @Override
    public void comer() {
        System.out.println("Loro comiendo");
    }

    @Override
    public void nadar() {

    }
}
