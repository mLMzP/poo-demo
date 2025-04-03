package com.lm2a.arq_capas.data;

import com.lm2a.arq_capas.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository implements IUserRepository {

    ArrayList<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        User u1 = new User(1, "Juan", "Perez", "1234567Q", "juan@perez.com");
        User u2 = new User(2, "Juan2", "Perez", "2234567Q", "juan2@perez.com");
        User u3 = new User(3, "Juan3", "Perez", "3234567Q", "juan3@perez.com");
        User u4 = new User(4, "Juan4", "Perez", "4234567Q", "juan4@perez.com");
        User u5 = new User(5, "Juan5", "Perez", "5234567Q", "juan5@perez.com");
        User u6 = new User(6, "Juan6", "Perez", "6234567Q", "juan6@perez.com");
        User u7 = new User(7, "Juan7", "Perez", "7234567Q", "juan7@perez.com");

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);

    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User updateUser(User userParam) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == userParam.getId()) {
                users.remove(user);
                users.add(userParam);
                return userParam;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                users.remove(user);
                return;
            }
        }
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
