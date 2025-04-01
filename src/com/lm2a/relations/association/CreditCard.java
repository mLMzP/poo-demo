package com.lm2a.relations.association;

public class CreditCard {
    private String name;
    private String number;

    public void toPay(){
        System.out.println("Paying with "+" credit card: "+name);
    }
}
