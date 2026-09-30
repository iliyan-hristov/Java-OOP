package _01_Abstractions_Exercise._3_Cards_with_Power;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cardRank = scan.nextLine();
        String cardSuit = scan.nextLine();

        CardRank rank = CardRank.valueOf(cardRank);
        CardSuit suit = CardSuit.valueOf(cardSuit);


        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, rank.getPower() + suit.getPower());

    }


}
