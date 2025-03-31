package com.lm2a.heritage.polimorfismo;

public class Hippo extends Animal{

    public Hippo() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Hippo making noise");
    }

    @Override
    public void eat() {
        System.out.println("Hippo eating");
    }

    @Override
    public void sleep() {
        System.out.println("Hippo sleeping");
    }

    @Override
    public void roam() {
        System.out.println("Hippo roaming");
    }
}
