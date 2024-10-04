package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ElectricalBike extends Bicicleta implements Bicicletas{

    private Autonomia autonomia;

    @Override
    public void frenar(double velocidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frenar'");
    }

    @Override
    public void acelerar(double velocidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }

}
