package _03_Inheritance_Exercise._5_Restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    private String name;
    private double price;
    private double grams;

    public double getGrams() {
        return grams;
    }
}
