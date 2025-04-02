package com.lm2a.arq_capas.data;

import com.lm2a.arq_capas.model.User;

import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public void save(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
