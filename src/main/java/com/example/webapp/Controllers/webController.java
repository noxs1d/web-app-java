package com.example.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class webController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("Title", "Main menu");
        return "home";
    }

    @GetMapping("/about-company")
    public String about(Model model){
        model.addAttribute("about-company","О Компании");
        return "about";
    }
}
