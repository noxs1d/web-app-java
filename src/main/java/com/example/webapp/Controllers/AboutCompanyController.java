package com.example.webapp.Controllers;

import com.example.webapp.models.post;
import com.example.webapp.repo.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutCompanyController {
    @Autowired
    private postRepository postRepository;
    @GetMapping("/about")
    public String AboutCompanyBlog(Model model){
        model.addAttribute("abouttitle","About Company");
        Iterable<post> posts=postRepository.findAll();
        model.addAttribute("posts", posts);
        return "about";
    }

}
