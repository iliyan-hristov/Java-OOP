package _02_Encapsulation_Exercise._3_Shopping_Spree;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String[] peopleInput = scan.nextLine().split(";");
        for (String token : peopleInput){
             String personName = token.split("=")[0];
             double personMoney = Double.parseDouble(token.split("=")[1]);
             Person person = new Person(personName, personMoney);
             people.add(person);
        }

        List<Product> products = new ArrayList<>();

        String[] productsInput = scan.nextLine().split(";");
        for (String token : productsInput){
            String productName = token.split("=")[0];
            double productCost = Double.parseDouble(token.split("=")[1]);
            Product product = new Product(productName, productCost);
            products.add(product);
        }

        List<Person> list = new LinkedList<>();
        String[] line = scan.nextLine().split(" ");
        while (!line[0].equals("END")){

            if (line.length == 2){
                String personName = line[0];
                String productName = line[1];

                Person person = people.stream().filter(p -> p.getName().equals(personName)).findFirst().orElse(null);
                Product product = products.stream().filter(p -> p.getName().equals(productName)).findFirst().orElse(null);

                if (person != null && product != null){
                    person.buyProduct(product);
                    people.add(person);
                }
                if (!list.contains(person)) {
                    list.add(person);
                }
            }
            line = scan.nextLine().split(" ");
        }


        list.forEach(System.out::println);

    }
}
