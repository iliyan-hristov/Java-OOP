package _03_Inheritance_Exercise._6_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while(!line.equals("Beast!")){

            String[] tokens = scan.nextLine().split("\\s+");
            try{
                switch (line){
                    case "Cat":
                        Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(cat);
                        break;

                    case "Dog":
                        Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(dog);
                        break;

                    case "Frog":
                        Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(frog);
                        break;

                    case "Kitten":
                        Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(kitten);
                        break;

                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(tomcat);
                        break;
                }


            }catch ( IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            line = scan.nextLine();
        }

    }
}
