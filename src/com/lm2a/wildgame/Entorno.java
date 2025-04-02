package com.lm2a.wildgame;

public class Entorno {

    private Presa presa;
    private Depredador depredador;

    public Entorno(Presa presa, Depredador depredador) {
        this.presa = presa;
        this.depredador = depredador;
    }

    public void jugar(){
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();
        presa.comer();
        depredador.atacar();
        int desenlace = (int)(Math.random()*10+1);
        if(desenlace > 5){
            presa.escapar();
        }else{
            depredador.comer();
        }
    }
}
