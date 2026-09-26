package _01_Abstractions._1_Card_Suits;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

            System.out.println("Card Suits:");
            Arrays.stream(CardSuit.values()).forEach(System.out::println);

    }
}
