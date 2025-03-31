package com.lm2a.heritage.ejercicio;

public class Autobus extends Vehiculo {
    private int numAsientos;
    private int numPuertas;
    private int numVentanillas;

    public Autobus(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas, int numVentanillas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Numero de asientos: "+numAsientos);
        System.out.println("Numero de puertas: "+numPuertas);
        System.out.println("Numero de ventanlas: "+numVentanillas);
    }


}
