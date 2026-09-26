package _01_Abstractions._1_Card_Suits;

public enum CardSuit {

    CLUBS, DIAMONDS, HEARTS, SPADES;


    @Override
    public String toString(){

        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }
}
