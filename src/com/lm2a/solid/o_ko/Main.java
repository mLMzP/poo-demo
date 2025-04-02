package com.lm2a.solid.o_ko;

public class Main {

    public static void main(String[] args) {
        Coche[] coches = {new Coche("Renault"), new Coche("Peugeot"), new Coche("BMW")};
        imprimirPrecioMedioCoche(coches);
    }

    public static void imprimirPrecioMedioCoche(Coche[] coches) {
        for (Coche coche : coches) {
            if(coche.getMarca().equals("Peugeot")){
                System.out.println(22000);
            }
            if(coche.getMarca().equals("Renault")){
                System.out.println(25000);
            }
            if(coche.getMarca().equals("BMW")){
                System.out.println(42000);
            }

        }
    }
}
