package com.lm2a.heritage.polimorfismo;

public class Wolf extends Animal {

    public Wolf() {
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Wolf making noise");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Wolf eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Wolf sleeping");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("Wolf roaming");
    }
}
