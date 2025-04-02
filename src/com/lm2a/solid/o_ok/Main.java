package com.lm2a.solid.o_ok;



public class Main {

    public static void main(String[] args) {
        Coche[] coches = {new BMW(), new Peugeot(), new Renault(), new Tesla()};
        imprimirPrecioMedioCoche(coches);
    }

    public static void imprimirPrecioMedioCoche(Coche[] coches) {
        for (Coche coche : coches) {
            System.out.println(coche.precioMedioCoche());
        }
    }
}
