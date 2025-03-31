package com.lm2a.heritage.polimorfismo;

public class Tiger extends Animal{
    public Tiger() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Tiger making noise");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eating");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeping");
    }

    @Override
    public void roam() {
        System.out.println("Tiger roaming");
    }
}
