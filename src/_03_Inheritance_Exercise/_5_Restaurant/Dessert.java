package _03_Inheritance_Exercise._5_Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    private double calories;

    public double getCalories() {
        return calories;
    }
}
