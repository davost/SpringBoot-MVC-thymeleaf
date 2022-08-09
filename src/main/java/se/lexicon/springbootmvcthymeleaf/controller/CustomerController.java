package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.springbootmvcthymeleaf.model.dto.CustomerForm;

@Controller
public class CustomerController {

    @GetMapping("/customer")
    public String goToCustomer(Model model) {
        System.out.println("GoToCustomer method has been executed");
        CustomerForm customerForm = new CustomerForm();
        model.addAttribute("customerForm", customerForm);
        return  "customer/customer";

    }

    @PostMapping("/createCust")
    public String createCustomer(@ModelAttribute("customerForm") CustomerForm customerForm) {
        System.out.println("Print customerForm" + customerForm);
        return  "customer/customer";

    }
}
