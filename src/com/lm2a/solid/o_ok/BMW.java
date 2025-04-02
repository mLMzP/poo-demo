package com.lm2a.solid.o_ok;

public class BMW extends Coche {
    public BMW() {
        super("BMW");
    }

    @Override
    int precioMedioCoche() {
        return 42000;
    }
}
