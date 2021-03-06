package com.fexample.fhub.dao.dto.Session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fexample.fhub.dao.model.classes.User.User;

import com.fexample.fhub.dao.model.enums.Status;
import com.fexample.fhub.facade.interfaces.dto.DtoEntity;
import com.fexample.fhub.facade.interfaces.dto.DtoRequestEntity;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignUpDto implements DtoRequestEntity<User>{

    private String username;
    private String password;
    private String email;
    private Status status;
    private String firstname;
    private String lastname;

    public User toModel() {
        User user = new User();

        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setStatus(status);
        user.setFirstname(firstname);
        user.setLastname(lastname);

        return user;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Status getStatus() {

        return status;
    }

    public void setStatus(Status status) {

        this.status = status;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }
}