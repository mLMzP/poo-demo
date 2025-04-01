package com.lm2a.interfaces;

public class InterfacesTest {

    public static void main(String[] args) {
        MiInterfaz[] misInterfaces = new MiInterfaz[2];

        misInterfaces[0] = new ClaseA();
        misInterfaces[1] = new ClaseB();

        for (MiInterfaz mi : misInterfaces) {
            System.out.println(mi.m3(5));
        }

        //MiInterfaz mI = new MiInterfaz();
    }
}
