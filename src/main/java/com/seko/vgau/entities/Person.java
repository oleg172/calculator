package com.seko.vgau.entities;

public abstract class Person {

    private Sex sex;
    private int age;
    private double height;
    private double weight;
    private double activityCoef;

    public Person(Sex sex, int age, double height, double weight, double activityCoef) {
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.activityCoef = activityCoef;
    }

    public abstract double calculate();

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getActivityCoef() {
        return activityCoef;
    }
}
