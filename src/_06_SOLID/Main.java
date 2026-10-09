package _06_SOLID;

import java.util.List;

public class Main {

    public static void main(String[] args) {

            QuantityCalculatorFood quantityCalculatorFood = new QuantityCalculatorFood();

            Cloud cloud = new Cloud();
            quantityCalculatorFood.average(List.of(cloud));

            Printer printerDrinks = new Printer(new QuantityCalculatorDrink());
            Printer printerFood = new Printer(quantityCalculatorFood);
            Printer printerCalories = new Printer(new CalorieCalculator());

    }
}
