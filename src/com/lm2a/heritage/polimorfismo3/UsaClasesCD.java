package com.lm2a.heritage.polimorfismo3;

public class UsaClasesCD {

    public static void main(String[] args) {
        C o = new D();
        o.p(o);

        ((D)o).p(o);

        o.p((D)o);
    }
}
