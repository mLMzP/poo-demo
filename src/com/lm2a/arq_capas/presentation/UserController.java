package com.lm2a.arq_capas.presentation;

import com.lm2a.arq_capas.model.User;
import com.lm2a.arq_capas.services.IUserService;

public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    public void showUser(int id) {
        User userById = userService.getUserById(id);
        if(userById != null) {
            p(userById.toString())
        }else{
            p("User not found");
        }
    }






    private void p(String msg) {
        System.out.println(msg);
    }
}
