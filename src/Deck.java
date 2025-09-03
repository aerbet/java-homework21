import java.util.Arrays;
import java.util.Random;

public class Deck {
    private final Card[] deck = new Card[52];

    public Deck() {
        fillDeck();
        mixDeck();
        System.out.println(Arrays.toString(deck));
    }

    public void putBackCard(Card card) {
        for (int i = 0; i < deck.length; i++) {
            if(deck[i] == null) {
                deck[i] = card;
                System.out.println(Arrays.toString(deck));

            }
        }
    }

    public void mixDeck() {
        Random rand = new Random();


        for (int i = 0; i < deck.length; i++) {
            Card temp = deck[i];
            int randNum = rand.nextInt(deck.length - i) + i;
            deck[i] = deck[randNum];
            deck[randNum] = temp;

        }
    }

    public Card takeCard() {
        Random rand = new Random();
        int randNum = rand.nextInt(deck.length);
        for (int i = 0; i < deck.length; i++) {
            if(deck[i] != null) {
                Card card = deck[randNum];
                deck[randNum] = null;
                System.out.println(Arrays.toString(deck));

                return card;
            }
        }

        return null;
    }

    public void fillDeck() {
        int index = 0;
        for (Values value : Values.values()) {
            for (Suits suit : Suits.values()) {
                deck[index++] = new Card(value, suit);
            }
        }
    }

}
