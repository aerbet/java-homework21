import java.util.Arrays;
import java.util.Random;

public class Deck {
    private final Card[] deck = new Card[52];

    public Deck() {
        fillDeck();
        mixDeck();
    }

    public void putBackCard(Card card) {
        boolean isDeckFull = true;

        for (Card c : deck) {
            if (c == null) {
                isDeckFull = false;
                break;
            }
        }

        if (isDeckFull) {
            System.out.println("Колода полная");
        }

        for (int i = 0; i < deck.length; i++) {
            if(deck[i] != null && deck[i].getValue() == card.getValue() && deck[i].getSuit() == card.getSuit()) {
                return;
            } else if (deck[i] == null) {
                deck[i] = card;
                break;
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
        boolean isEmpty = true;

        for (Card c : deck) {
            if (c != null) {
                isEmpty = false;
                break;
            }
        }

        if (isEmpty) {
            return null;
        }

        Random rand = new Random();
        int randNum;

        do {
            randNum = rand.nextInt(deck.length);
        } while (deck[randNum] == null);

        Card card = deck[randNum];
        deck[randNum] = null;
        return card;
    }

    public void fillDeck() {
        int index = 0;
        for (Values value : Values.values()) {
            for (Suits suit : Suits.values()) {
                deck[index++] = new Card(value, suit);
            }
        }
    }

    public void printDeck() {
        System.out.println(Arrays.toString(deck));
    }
}
