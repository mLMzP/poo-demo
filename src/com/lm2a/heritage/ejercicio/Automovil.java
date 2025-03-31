package com.lm2a.heritage.ejercicio;

public class Automovil extends Vehiculo {
    private int numAsientos = 5;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Numero de asientos: "+numAsientos);
        System.out.println("Numero de puertas: "+numPuertas);
    }


}
