package com.trenchbl.blogger.bloggerjava.controllers;

import com.trenchbl.blogger.bloggerjava.entities.BlogPost;
import com.trenchbl.blogger.bloggerjava.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/posts")
public class BlogPostsController {

    @Autowired
    private BlogPostRepository postsRepository;

    @GetMapping("/")
    public String loadPage(Model model) {
        model.addAttribute("blogPost", new BlogPost());
        return "protected/add-post";
    }

    @PostMapping("/add")
    public String createNewBlogPost(@ModelAttribute BlogPost newEntry, Model model) {
        postsRepository.save(newEntry);

        model.addAttribute("message", "Blog Post Added!");
        model.addAttribute("blogPost", newEntry);

        return "protected/add-post";
    }

    // remove
    // edit
}
