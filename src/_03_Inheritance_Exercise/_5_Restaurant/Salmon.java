package _03_Inheritance_Exercise._5_Restaurant;

import java.math.BigDecimal;

public class Salmon extends Food{
    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

    final static double SALMON_GRAMS = 22;


}
