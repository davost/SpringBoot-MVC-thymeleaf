package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String goToDashboard() {
        System.out.println("GotoDashboard method has been executed.");
        return "dashboard";
    }
}
