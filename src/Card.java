import java.util.Random;

public class Card {
    protected String value;
    protected Suits suit;

    protected Card(String value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + suit;
    }
}
