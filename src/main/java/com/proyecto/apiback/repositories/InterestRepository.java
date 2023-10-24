package com.proyecto.apiback.repositories;


import com.proyecto.apiback.models.entities.Interest;
import com.proyecto.apiback.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface InterestRepository extends CrudRepository <Interest, Long>{

}
