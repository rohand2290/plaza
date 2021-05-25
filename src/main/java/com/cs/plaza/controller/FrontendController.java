package com.cs.plaza.controller;

import java.util.Date;

import com.cs.plaza.repo.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

}
