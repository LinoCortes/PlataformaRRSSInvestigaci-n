package com.proyecto.apiback.services;

import com.proyecto.apiback.models.entities.User;

import java.util.List;


public interface UserService {
    List<User> findAll();

    User save(User user);

}
