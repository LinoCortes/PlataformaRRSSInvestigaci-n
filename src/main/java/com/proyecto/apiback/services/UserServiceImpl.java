package com.proyecto.apiback.services;

import com.proyecto.apiback.models.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyecto.apiback.repositories.UserRepository;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

        List<User> users =  (List<User>) repository.findAll();
        return users;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

}
