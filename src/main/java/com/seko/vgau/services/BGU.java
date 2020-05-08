package com.seko.vgau.services;

import com.seko.vgau.entities.Person;

public class BGU {

    private double forPeson;
    private double protein;
    private double fats;
    private double carbohydrates;

    public void calculateBGU(Person person) {
        forPeson = person.calculate() * person.getActivityCoef();
        protein = person.getWeight() * 1.7;
        fats = person.getWeight() * 1;
        carbohydrates = (forPeson - (protein * 4) - (fats * 9)) / 4;
    }

    public double getForPeson() {
        return forPeson;
    }

    public double getProtein() {
        return protein;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }
}
