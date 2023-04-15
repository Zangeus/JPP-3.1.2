package com.example.jpp3_1_2.service;


import com.example.jpp3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(int id);
    void createUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
}
