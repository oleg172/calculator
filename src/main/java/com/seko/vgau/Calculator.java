package com.seko.vgau;

import com.seko.vgau.entities.Man;
import com.seko.vgau.entities.Person;
import com.seko.vgau.entities.Woman;
import com.seko.vgau.services.BGU;
import com.seko.vgau.util.Utils;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите свой возраст в годах");
        int age = scan.nextInt();
        //пока возраст < 0 просим пользователя ввести его заново
        while (!Utils.validateAge(age)) {
            System.out.println("Возраст обязан быть больше 0. Введите возраст заново.");
            age = scan.nextInt();
        }
        System.out.println("Укажите свой рост в см.");
        double height = scan.nextDouble();
        System.out.println("Укажите свой вес в кг.");
        double weight = scan.nextDouble();
        System.out.println("Укажите свой пол: " + "Мужчина(нажмите 1), если Женищна(нажмите 2)");
        int gender = scan.nextInt();

        Amr amr = new Amr();
        amr.amr();
        double coefficient = scan.nextDouble();

        Person person = null;
        if (gender == 1) {
            person = new Man(age, height, weight, coefficient);
        } else if (gender == 2) {
            person = new Woman(age, height, weight, coefficient);
        }

        BGU bgu = new BGU();
        bgu.calculateBGU(person);

        System.out.println("Ваша суточная норма: " + bgu.getForPeson() + " калорий.");
        System.out.println("Соотношение БЖУ: ");
        System.out.println("Белки: " + bgu.getProtein() + " грамм(а)");
        System.out.println("Жиры: " + bgu.getFats() + " грамм(а)");
        System.out.println("Углеводы: " + bgu.getCarbohydrates() + " грамм(а)");

    }
}
