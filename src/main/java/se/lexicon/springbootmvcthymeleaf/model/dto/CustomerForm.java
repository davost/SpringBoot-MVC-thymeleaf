package se.lexicon.springbootmvcthymeleaf.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerForm {

    @NotEmpty(message = "Name should not be empty.")
    private String name;
}
