package com.lm2a.heritage;

public class LoginUser extends User {

    private String password;

    public LoginUser(String name, String email, String password) {
        super(name, email);
        this.password = password;
    }
}
