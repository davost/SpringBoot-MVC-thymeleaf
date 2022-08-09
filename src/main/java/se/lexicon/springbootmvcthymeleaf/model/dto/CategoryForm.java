package se.lexicon.springbootmvcthymeleaf.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryForm {

   @NotEmpty(message = "Name category must not be empty")
   private String name;

}
