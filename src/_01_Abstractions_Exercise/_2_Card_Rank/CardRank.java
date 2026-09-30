package _01_Abstractions_Exercise._2_Card_Rank;

public enum CardRank {

    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;


    @Override
    public String toString(){

        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());

    }

}
