package com.seko.vgau.entities;

public class Man extends Person {

    private double coef1 = 88.362;
    private double coef2 = 13.397;
    private double coef3 = 4.799;
    private double coef4 = 5.677;

    public Man(int age, double height, double weight, double activityCoef) {
        super(Sex.MAN, age, height, weight, activityCoef);
    }

    public double calculate() {
        return coef1 + (coef2 * getHeight()) + (coef3 * getWeight()) - (coef4 * getAge());
    }
}
