package com.lm2a.solid.i_ok;

public class Loro implements IAve, IAveVoladora {
    @Override
    public void volar() {
        System.out.println("Loro volando");
    }

    @Override
    public void comer() {
        System.out.println("Loro comiendo");
    }

}
