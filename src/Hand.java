
public class Hand {
    Card[] handCards = new Card[5];

    public void printHand() {
        System.out.println("Текущая рука: ");
        for (int i = 0; i < handCards.length; i++) {
            System.out.printf(" %-2s |", i + 1);
        }
        System.out.println();
        for (Card handCard : handCards) {
            System.out.printf(" %-2s |", handCard.toString());
        }
        System.out.println();
    }

    public void changeCard(int position, Card newCard) {
        handCards[position] = newCard;
    }

    public void addCard(Deck deck) {
        for (int i = 0; i < handCards.length; i++) {
            handCards[i] = deck.takeCard();
        }
    }
}
