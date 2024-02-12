package com.example.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutCompanyController {
    @GetMapping("/about")
    public String AboutCompanyBlog(Model model){
        model.addAttribute("about-title","About");
        return "about";
    }

}
