package _4_Interfaces_and_Abstraction_Exercise._1_Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        String command = scan.nextLine();
//
//        List<Birthable> birthables = new ArrayList<>();
//
//        while (!"End".equals(command)) {
//            String[] tokens = command.split("\\s+");
//
//            switch (tokens[0]) {
//                case "Citizen" -> {
//                    Citizen citizen = new Citizen(tokens[1],
//                            Integer.parseInt(tokens[2]),
//                            tokens[3], tokens[4]);
//                    birthables.add(citizen);
//                }
//                case "Pet" -> {
//                    Pet pet = new Pet(tokens[1], tokens[2]);
//                    birthables.add(pet);
//                }
//            }
//
//            command = scan.nextLine();
//        }
//
//        String year = scan.nextLine();
//
//        birthables.stream()
//                .filter(birthable -> birthable.getBirthDate().endsWith(year))
//                .forEach(birthable -> System.out.println(birthable.getBirthDate()));


        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < n ; i++) {

            String [] tokens = scan.nextLine().split("\\s+");

            if (tokens.length == 4){
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyers.put(tokens[0], citizen);
            } else if (tokens.length == 3){
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                buyers.put(tokens[0], rebel);

            }

        }

        String buyer = scan.nextLine();

        while(!"End".equals(buyer)){

            Buyer buyer1 = buyers.get(buyer);
            if (buyer1 != null){
                buyer1.buyFood();
            }

            buyer = scan.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);


    }
}

























