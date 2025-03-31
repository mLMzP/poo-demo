package com.lm2a.heritage.ejercicio;

public class Motocicleta extends Vehiculo{
    private int numAsientos = 2;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Asientos: "+numAsientos);
    }

}
