package _3_Inheritance_Exercise._5_Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    public Coffee(String name, BigDecimal price, double milliliters, double caffeine) {
        super(name, price, milliliters);
        this.caffeine = caffeine;
    }

    final static double COFFEE_MILLILITERS = 50;
    final static double COFFEE_PRICE = 3.50;
    private double caffeine;

    public double getCaffeine() {
        return caffeine;
    }
}
