package com.saiko.workshop.mongo.repositories;

import com.saiko.workshop.mongo.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
