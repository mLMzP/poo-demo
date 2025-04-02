package com.lm2a.wildgame;

public class Conejito implements Presa {

    @Override
    public void pasear(){
        System.out.println("Conejito paseando");
    }

    @Override
    public void comer(){
        System.out.println("Conejito comiendo");
    }

    @Override
    public void escapar(){
        System.out.println("Conejito escapando");
    }
}
