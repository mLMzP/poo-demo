package com.lm2a.heritage.polimorfismo;

public class Lion extends Animal{

    public Lion() {
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Lion making noise");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Lion eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Lion sleeping");
    }

    @Override
    public void roam() {
        super.roam();
        System.out.println("Lion roaming");
    }
}
