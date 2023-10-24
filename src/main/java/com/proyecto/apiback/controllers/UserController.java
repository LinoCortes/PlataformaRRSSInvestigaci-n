package com.proyecto.apiback.controllers;

import com.proyecto.apiback.models.entities.User;
import com.proyecto.apiback.models.entities.UserBody;
import com.proyecto.apiback.models.entities.exception.NotFoundInterest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.proyecto.apiback.services.UserService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserBody userBody) {
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(userBody));
        } catch (NotFoundInterest ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: " + ex.getMessage());
        }


    }
}

