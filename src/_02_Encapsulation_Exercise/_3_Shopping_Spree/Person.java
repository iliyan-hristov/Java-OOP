package _02_Encapsulation_Exercise._3_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    List<Product> bagOfProducts;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        return money;
    }

    private void setMoney(double money) {
        this.money = money;
    }

    public void buyProduct(Product product){
        if (this.getMoney() >= product.getCost()){
            this.bagOfProducts.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
        } else {
            System.out.printf("%n%s can't afford %s%n", this.getName(), product.getName());
        }
    }
}
