package com.ecam;

public class Compute {
    public double addition(double a, double b) {
        return a + b;
    }

    public double substraction(double a, double b) {
        return addition(a,-b);
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return multiplication(a,1/b);
    }
}
