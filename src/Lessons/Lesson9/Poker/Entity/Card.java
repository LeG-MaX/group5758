package Lessons.Lesson9.Poker.Entity;

public class Card {
    public String value;
    public String suit; //масть

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
