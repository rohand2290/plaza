package com.cs.plaza.repo;

import com.cs.plaza.model.Post;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
