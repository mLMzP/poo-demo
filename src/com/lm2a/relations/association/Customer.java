package com.lm2a.relations.association;

public class Customer {
    private int id;
    private String nombre;
    private CreditCard creditCard;

    public Customer() {
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    //otros metodos
}
