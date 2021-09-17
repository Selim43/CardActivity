package com.example.carddeck;

public class Card {


    private Suit suit;
    private FaceValue value;

    public Card(){

    }

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public FaceValue getValue() {
        return value;
    }

    public void setValue(FaceValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
