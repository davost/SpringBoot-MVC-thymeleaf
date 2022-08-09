package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String goToIndex() {
        System.out.println("GotoIndex method has been executed.");
        return "index";
    }

    @GetMapping("/about")
    public String gotToAbout() {
        System.out.println("GoToAbout method executed");
        return "about";
    }
}
