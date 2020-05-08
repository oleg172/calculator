package com.seko.vgau.entities;

public class Woman extends Person {

    private double coef1 = 447.593;
    private double coef2 = 9.247;
    private double coef3 = 3.098;
    private double coef4 = 4.330;

    public Woman(int age, double height, double weight, double activityCoef) {
        super(Sex.WOMAN, age, height, weight, activityCoef);
    }

    public double calculate() {
        return coef1 + (coef2 * getHeight()) + (coef3 * getWeight()) - (coef4 * getAge());
    }
}
