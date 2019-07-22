package com.trenchbl.blogger.bloggerjava.controllers;

import com.trenchbl.blogger.bloggerjava.entities.BlogPost;
import com.trenchbl.blogger.bloggerjava.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @Autowired
    private BlogPostRepository postRepository;

    @RequestMapping(path = {"/", "/home"})
    public String showPosts(Model model){
        Iterable<BlogPost> all = postRepository.findAll();

        model.addAttribute("blogPosts", all);

        return "home";
    }
}
