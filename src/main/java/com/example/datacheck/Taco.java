package com.example.datacheck;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Размер должен быть больше 5 символов")
    private String title;

    @NotNull
    private int price;
}
