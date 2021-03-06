package com.igorpavlenkov.spring.pringboot.springboot.service;


import com.igorpavlenkov.spring.pringboot.springboot.model.Role;
import com.igorpavlenkov.spring.pringboot.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserByName(String username);

    Role getRoleByName(String name);

    void addRole(Role role);
}
