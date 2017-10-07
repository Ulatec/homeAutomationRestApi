package com.teamtreehouse.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

/**
 * Created by mark on 10/7/17.
 */
@Entity
public class User extends BaseModel{
    String name;
    String[] roles;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
