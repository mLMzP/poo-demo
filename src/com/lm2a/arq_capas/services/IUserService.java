package com.lm2a.arq_capas.services;

import com.lm2a.arq_capas.model.User;

import java.util.List;

public interface IUserService {

    void save(User user);//C

    User getUserById(int id);//R

    User updateUser(User user);//U

    void deleteUser(int id);//D

    List<User> getAllUsers();//R

    String getCompleteName(int id);

    String getReverseCompleteName(int id);
}
