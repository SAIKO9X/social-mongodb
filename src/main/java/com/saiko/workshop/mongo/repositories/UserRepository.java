package com.saiko.workshop.mongo.repositories;

import com.saiko.workshop.mongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
