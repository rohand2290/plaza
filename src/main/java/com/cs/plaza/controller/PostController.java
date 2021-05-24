package com.cs.plaza.controller;

import java.util.List;

import com.cs.plaza.model.Post;
import com.cs.plaza.repo.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping("/api/post")
    public Post add(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping("/api/post")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/api/post/{id}")
    public Post getOne(@PathVariable String id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

}
