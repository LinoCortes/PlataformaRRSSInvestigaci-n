package com.proyecto.apiback.models.entities;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class UserBody {

    private Long id;

    private String name;

    private String lastname;

    private String birthDate;

    private String institutions;

    private String academicDegree;

    private String teachingInstitution;

    private String teachingRole;

    private String email;

    private String password;

    private Long [] interest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getInstitutions() {
        return institutions;
    }

    public void setInstitutions(String institutions) {
        this.institutions = institutions;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getTeachingInstitution() {
        return teachingInstitution;
    }

    public void setTeachingInstitution(String teachingInstitution) {
        this.teachingInstitution = teachingInstitution;
    }

    public String getTeachingRole() {
        return teachingRole;
    }

    public void setTeachingRole(String teachingRole) {
        this.teachingRole = teachingRole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long[] getInterest() {
        return interest;
    }

    public void setInterest(Long[] interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "UserBody{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", institutions='" + institutions + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", teachingInstitution='" + teachingInstitution + '\'' +
                ", teachingRole='" + teachingRole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", interest=" + Arrays.toString(interest) +
                '}';
    }
}

