package com.lm2a.arq_capas.presentation;

import com.lm2a.arq_capas.model.User;
import com.lm2a.arq_capas.services.IUserService;

import java.util.List;

public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    public void showUser(int id) {
        p("---------------------showUser:"+id+"------------------------");
        User userById = userService.getUserById(id);
        if(userById != null) {
            p(userById.toString());
        }else{
            p("User not found");
        }
    }

    public void addUser(User user){
        userService.save(user);
    }

    public void allUsers() {
        p("---------------------allUsers------------------------");
        List<User> users = userService.getAllUsers();
        p(users.toString());
    }

    public void showCompleteName(int id){
        p("---------------------showCompleteName------------------------");
        p(userService.getCompleteName(id));
    }

    public void showReversedCompleteName(int id){
        p("---------------------showReversedCompleteName------------------------");
        p(userService.getReverseCompleteName(id));
    }




    private void p(String msg) {
        System.out.println(msg);
    }
}
