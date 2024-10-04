package com.example;

public class ElectricalBike implements Bicicletas{
    
    private String marca;
    private int sillin;
    private int engranajes;
    private double velocidad;

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
