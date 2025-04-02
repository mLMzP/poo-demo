package com.lm2a.wildgame;

public class LoboFeroz implements Depredador {

    @Override
    public void acechar(){
        System.out.println("Lobo feroz acechando");
    }

    @Override
    public void atacar(){
        System.out.println("Lobo feroz atacando");
    }

    @Override
    public void comer(){
        System.out.println("Lobo feroz comiendo");
    }
}
