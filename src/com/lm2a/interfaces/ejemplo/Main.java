package com.lm2a.interfaces.ejemplo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Tostadora t = new Tostadora("Philips", 35.5);
        Juguera j = new Juguera("Why", 500, 23.60);

        ArrayList<Preciable> articulos = new ArrayList<>();
        articulos.add(j);
        articulos.add(t);

        double total = 0;
        for (Preciable p : articulos) {
            total = total + p.getPrecio();
        }

        System.out.println(total);

    }
}
