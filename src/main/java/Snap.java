import java.util.Scanner;

public class Snap extends CardGame {

    public Snap() {
        super(); // Creates a new shuffled deck
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Card previousCard = null;

        System.out.println("Welcome to Snap! Press Enter to draw cards. Match ranks to win!");

        while (!getDeck().isEmpty()) {
            System.out.print("Press Enter to deal a card...");
            scanner.nextLine(); // waits for Enter

            Card currentCard = dealCard();
            System.out.println("You drew: " + currentCard);

            if (previousCard != null && currentCard.rank() == previousCard.rank()) {
                System.out.println("SNAP! You win!");
                return;
            }

            previousCard = currentCard;
        }

        System.out.println("No more cards. Game over.");
    }
}
