package com.lm2a.init;

public class UseCar {

    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "Rav4", 2004);

        Car tesla = new Car("Tesla", "M3", 2021);

        System.out.println(toyota.getModel());
        System.out.println(tesla.getModel()+" "+tesla.getYear());
    }
}
