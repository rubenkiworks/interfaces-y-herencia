package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data

public abstract class Bicicleta {
    private String marca;
    private int sillin;
    private int engranajes;
    private double velocidad;
}
