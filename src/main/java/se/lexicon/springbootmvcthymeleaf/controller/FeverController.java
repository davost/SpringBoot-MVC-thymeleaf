package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.springbootmvcthymeleaf.model.dto.FeverForm;

@Controller
public class FeverController {

    @GetMapping("/fever") // localhost:8080/fever
    public String gotToFDeverPage(Model model){
        System.out.println("GoToFeverPage method has been executed");
        FeverForm feverForm = new FeverForm();
        model.addAttribute("feverForm", feverForm);
        return "fever";
    }

    @PostMapping("/calcFever")
    public String createCustomer(@ModelAttribute("feverForm") FeverForm feverForm, Model model
    ) {
        System.out.println("Print feverForm" + feverForm);
        if (feverForm.getTemperature() >= 39){
            model.addAttribute("message", "you have a fever");
        }
            if (feverForm.getTemperature() == 39) {
                model.addAttribute("message", "you have a normal temperature");
            }
            if (feverForm.getTemperature() < 39) {
                model.addAttribute("message", "You have hypothermia.");
            }

        return  "fever-result";

    }
}
