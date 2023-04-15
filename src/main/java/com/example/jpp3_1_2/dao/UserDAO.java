package com.example.jpp3_1_2.dao;


import com.example.jpp3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void createUser(User user);
    User getUser(int id);
    void deleteUser(int id);
    void updateUser(User user);
}
