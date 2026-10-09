package _06_SOLID.products;


import _06_SOLID.Food;


public class Chocolate implements Food {

    private static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double amountOfCalories() {
        return CALORIES_PER_100_GRAMS / 100 * getGrams();
    }


    @Override
    public double amountOfFoods() {
        return this.grams / 1000;
    }

}
