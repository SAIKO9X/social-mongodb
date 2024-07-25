package com.saiko.workshop.mongo.dto;

import com.saiko.workshop.mongo.entities.User;

public record AuthorDTO(String id, String name) {
    public AuthorDTO(User user) {
        this(user.getId(), user.getName());
    }
}
