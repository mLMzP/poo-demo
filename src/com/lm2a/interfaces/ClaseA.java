package com.lm2a.interfaces;

public class ClaseA implements MiInterfaz {

    @Override
    public void m1() {
        System.out.println("ClaseA.m1()");
    }

    @Override
    public int m2() {
        return (int)(Math.random()*10);
    }

    @Override
    public String m3(int x) {
        return "Nro: "+x;
    }
}
