package com.example.datacheck;

import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostMapping("/main")
    public String menu(@Valid @RequestBody Taco taco, Errors errors){
        if(errors.hasErrors()){
            return "design";
        }
        return taco.getTitle() + " " + taco.getPrice();
    }
}
