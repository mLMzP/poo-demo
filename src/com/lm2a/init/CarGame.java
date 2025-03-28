package com.lm2a.init;

public class CarGame {

    private String color;
    private int numero;
    private String brand;
    private String model;

    public CarGame(String color, int numero, String brand, String model) {
        this.color = color;
        this.numero = numero;
        this.brand = brand;
        this.model = model;
    }

    public CarGame(String color, int numero) {
        this.color = color;
        this.numero = numero;
    }

    public CarGame() {
    }

    public void acelerar(){
        System.out.println("Coche "+numero+" acelerado");
    }

    public void frenar(){
        System.out.println("Coche "+numero+" frenando");
    }

    public void cambiarMarcha(int marcha){
        if((marcha >= 0) && (marcha <= 6)){
            System.out.println("Coche "+numero+" cambiando Marcha a "+marcha);
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
