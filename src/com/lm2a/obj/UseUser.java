package com.lm2a.obj;

public class UseUser {

    public static void main(String[] args) {

        User u = new User("Juan Perez", "juan.perez@gmail.com");

        System.out.println(u.getName());
        System.out.println(u.getEmail());
    }
}
