package com.lm2a.heritage.polimorfismo;

public class HeritageTesting {

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Tiger();
        animals[1] = new Lion();
        animals[2] = new Dog();
        animals[3] = new Cat();
        animals[4] = new Hippo();
        animals[5] = new Wolf();

        for(Animal a : animals) {
            a.makeNoise();
        }

//        Tiger t = new Tiger();
//        Lion l = new Lion();
//        Dog d = new Dog();
//        Cat c = new Cat();
//        Hippo h = new Hippo();
//        Wolf w = new Wolf();
//
//        t.makeNoise();
//        l.makeNoise();
//        d.makeNoise();
//        c.makeNoise();
//        h.makeNoise();
//        w.makeNoise();


    }
}
