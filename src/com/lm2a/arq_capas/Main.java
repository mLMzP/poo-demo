package com.lm2a.arq_capas;

import com.lm2a.arq_capas.data.IUserRepository;
import com.lm2a.arq_capas.data.UserRepository;
import com.lm2a.arq_capas.model.User;
import com.lm2a.arq_capas.presentation.UserController;
import com.lm2a.arq_capas.services.IUserService;
import com.lm2a.arq_capas.services.UserService;

public class Main {

    /**
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
         */


    public static void main(String[] args) {

        IUserRepository userRepository = new UserRepository();
        IUserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);
        userController.showUser(11);


        User u = new User(30, "Mario", "La Menza", "11111111Q", "lamenza@gmail.com");

        userController.allUsers();
        userController.addUser(u);

        userController.allUsers();

        userController.showCompleteName(5);
        userController.showReversedCompleteName(5);

    }
}
