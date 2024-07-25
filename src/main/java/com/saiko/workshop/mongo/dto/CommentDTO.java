package com.saiko.workshop.mongo.dto;

public record CommentDTO(String text, java.time.LocalDate date, AuthorDTO author) {
}