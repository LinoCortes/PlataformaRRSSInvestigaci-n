package com.proyecto.apiback.services;

import com.proyecto.apiback.models.entities.Interest;
import com.proyecto.apiback.models.entities.User;
import com.proyecto.apiback.models.entities.UserBody;
import com.proyecto.apiback.models.entities.exception.NotFoundInterest;
import com.proyecto.apiback.repositories.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyecto.apiback.repositories.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;

    @Autowired
    private InterestRepository interestRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

        List<User> users =  (List<User>) repository.findAll();
        return users;
    }

    @Override
    public User save(UserBody userBody) {

        User user = new User();
        user.setId(userBody.getId());
        user.setName(userBody.getName());
        user.setLastname(userBody.getLastname());
        user.setAcademicDegree(userBody.getAcademicDegree());
        user.setPassword(userBody.getPassword());
        System.out.println(Arrays.stream(userBody.getInterest()).toList());
        List<Interest> intereses = new ArrayList<>();

        for (Long id : Arrays.stream(userBody.getInterest()).toList()) {
            Optional<Interest> interesOptional = Optional.of(interestRepository.findById(id).orElseThrow(()-> new NotFoundInterest("Not found interest, id: "+id)));
            interesOptional.ifPresent(intereses::add);
        }

        user.setInterest(intereses);

        return repository.save(user);
    }


}
