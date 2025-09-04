
public class Card {
    protected Values value;
    protected Suits suit;

    protected Card(Values value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    public Values getValue() {
        return value;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }
}
