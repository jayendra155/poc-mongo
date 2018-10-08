package com.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sample.model.User;

@RestResource(path = "user")
public interface UserRepository extends MongoRepository<User, String> {

}
