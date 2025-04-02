package com.lm2a.wildgame;

public class Hiena implements Depredador {

    @Override
    public void acechar() {
        System.out.println("Hiena acechando");
    }

    @Override
    public void atacar() {
        System.out.println("Hiena atacando");
    }

    @Override
    public void comer() {
        System.out.println("Hiena comiendo");
    }
}
