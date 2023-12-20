package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    public String welcome(Model model) {
        model.addAttribute("tagline","Hello World");
        return "welcome";
    }
}
