package com.lm2a.heritage.ejercicio;

public class Vehiculo {

    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas(){
        System.out.println("Marca y Modelo: " + marcaModelo);
        System.out.println("Numero de Llantas: " + numLlantas);
        System.out.println("Precio Dia: " + precioDia);
    }

    public void encenderMotor(){
        System.out.println("Encendiendo motor");
    }

    public void apagarMotor(){
        System.out.println("Apagando motor");
    }

    public void funciona(){
        System.out.println("El vehiculo "+marcaModelo+" funciona correctamente");
    }

    public void pruebaDelMotor(){
        encenderMotor();
        apagarMotor();
        funciona();
    }
}
