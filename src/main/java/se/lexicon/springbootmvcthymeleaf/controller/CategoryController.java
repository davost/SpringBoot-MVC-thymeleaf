package se.lexicon.springbootmvcthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.springbootmvcthymeleaf.model.dto.CategoryForm;

@Controller
public class CategoryController {

    @GetMapping("/category")
    public String gotToCategory(Model model) {
        System.out.println("GoToCategory method has been executed");
        // todo: 1. add CategoryForm object to Model container
        CategoryForm categoryForm = new CategoryForm();
        model.addAttribute("categoryForm", categoryForm);
        return "category/category";
    }

 /*   @GetMapping("/form")
    public String categoryForm(Model model) {

        CategoryForm categoryForm = new CategoryForm();
        model.addAttribute("category", categoryForm);

        return "category/category-form";
    }*/

    @PostMapping("/create")
    public String createCategory(@ModelAttribute("categoryForm")  CategoryForm categoryForm){
        System.out.println("Print category form." + categoryForm);

        return "category/category";


    }

}
