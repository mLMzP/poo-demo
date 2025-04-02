package com.lm2a.wildgame;

public class PruebaDesenlace {

    public static void main(String[] args) {
        int cantidadEscapes = 0;
        for(int x = 0; x < 10000; x++){
            int desenlace = (int)(Math.random()*10+1);
            if(desenlace > 5){
                cantidadEscapes++;
            }
        }
        System.out.println(cantidadEscapes);
    }
}
