package com.lm2a.arq_capas.services;

import com.lm2a.arq_capas.data.IUserRepository;
import com.lm2a.arq_capas.model.User;

import java.util.List;

public class UserService implements IUserService {

    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public String getCompleteName(int id) {
        User userById = userRepository.getUserById(id);
        if(userById != null) {
            return userById.getName()+" "+userById.getLastName();
        }else{
            return "El usuario "+id+" no existe";
        }
    }

    @Override
    public String getReverseCompleteName(int id) {
        String completeName = getCompleteName(id);
        return reverseString(completeName);
    }

    public String reverseString(String input) {
        String output = "";
        int stringLength = input.length();
        for (int i = stringLength-1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
