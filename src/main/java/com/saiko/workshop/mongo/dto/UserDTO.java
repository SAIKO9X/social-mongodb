package com.saiko.workshop.mongo.dto;

import com.saiko.workshop.mongo.entities.User;

public record UserDTO(String id, String name, String email) {

    public UserDTO(User obj) {
        this(obj.getId(), obj.getName(), obj.getEmail());
    }
};
