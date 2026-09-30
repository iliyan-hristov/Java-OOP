package _01_Abstractions_Exercise._2_Card_Rank;

public class main {

    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (CardRank cardRank : CardRank.values()) {
            System.out.println(cardRank);
        }
    }
}
