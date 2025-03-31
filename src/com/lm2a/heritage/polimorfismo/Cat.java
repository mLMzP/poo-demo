package com.lm2a.heritage.polimorfismo;

public class Cat extends Animal{

    public Cat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat making noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }

    @Override
    public void roam() {
        System.out.println("Cat roaming");
    }
}
