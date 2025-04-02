package com.lm2a.arq_capas.data;

import com.lm2a.arq_capas.model.User;

import java.util.List;

public interface IUserRepository {

    void save(User user);//C

    User getUserById(int id);//R

    User updateUser(User user);//U

    void deleteUser(int id);//D

    List<User> getAllUsers();//R
}
