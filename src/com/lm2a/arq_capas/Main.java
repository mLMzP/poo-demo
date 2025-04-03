package com.lm2a.arq_capas;

import com.lm2a.arq_capas.data.UserRepository;
import com.lm2a.arq_capas.model.User;
import com.lm2a.arq_capas.services.UserService;

public class Main {

    public static void main(String[] args) {

//        UserRepository userRepository = new UserRepository();
//
//        User u = userRepository.getUserById(3);
//        System.out.println(u);
//
//        u.setEmail("juan3perez@proton.me");
//
//        System.out.println(userRepository.getUserById(3));
//
//        System.out.println(userRepository.getAllUsers());
//
//        userRepository.deleteUser(3);
//
//        System.out.println(userRepository.getAllUsers());

        UserService userService = new UserService(null);
        System.out.println(userService.reverseString("Hoy es jueves"));


    }
}
