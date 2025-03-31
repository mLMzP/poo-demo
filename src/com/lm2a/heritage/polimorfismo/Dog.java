package com.lm2a.heritage.polimorfismo;

public class Dog extends Animal{
    public Dog() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog making noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }

    @Override
    public void roam() {
        System.out.println("Dog roaming");
    }
}
