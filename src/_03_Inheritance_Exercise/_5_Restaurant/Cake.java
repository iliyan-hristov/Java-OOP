package _03_Inheritance_Exercise._5_Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
    }

    final static double CAKE_GRAMS = 250;
    final static double CAKE_CALORIES = 1000;
    final static BigDecimal CAKE_PRICE = new BigDecimal(5);
}
