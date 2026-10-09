package _06_SOLID;

import java.util.List;

public class QuantityCalculatorFood implements Calculator<Food> {


    @Override
    public double sum(List<Food> products) {
        return products.stream().mapToDouble(Food::amountOfFoods).sum();
    }

    @Override
    public double average(List<Food> products) {
        return sum(products) / products.size();
    }
}
