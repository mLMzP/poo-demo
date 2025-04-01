package com.lm2a.interfaces;

public class ClaseB implements MiInterfaz {

    @Override
    public void m1() {
        System.out.println("ClaseB.m1()");
    }

    @Override
    public int m2() {
        return 8;
    }

    @Override
    public String m3(int x) {
        return ""+x;
    }
}
