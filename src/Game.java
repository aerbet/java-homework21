import java.util.Scanner;

public class Game {

    public void runGame() {
        Deck deck = new Deck();
        Hand hand = new Hand();

        hand.addCard(deck);
        hand.printHand();

        replaceCards(hand, deck);
        hand.printHand();
    }

    public void replaceCards(Hand hand, Deck deck) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер карты который хотите заменить");
        String[] user = sc.nextLine().trim().split("\\s+");

        for (String s : user) {
            int index = Integer.parseInt(s) - 1;
            if (index < 0 || index > hand.handCards.length) {
                System.out.println("Карты с таким индексом не существует");
                break;
            }
            hand.changeCard(index, deck.takeCard());
        }


    }
}
