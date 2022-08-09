package se.lexicon.springbootmvcthymeleaf.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FeverForm {

    private double temperature;
}
