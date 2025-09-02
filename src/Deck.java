import java.util.Arrays;

public class Deck {
    protected String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    protected Card[] deck = new Card[52];
    protected Suits[] suits = {Suits.HEARTS, Suits.TILES, Suits.CLOVERS, Suits.PIKES};

    public Deck() {
        fillDeck();
        System.out.println(Arrays.toString(deck));
    }

    public void fillDeck() {
        int index = 0;
        for (String value : values) {
            for (Suits suit : suits) {
                deck[index++] = new Card(value, suit);
            }
        }
    }

}
