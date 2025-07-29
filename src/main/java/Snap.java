import java.util.Scanner;

public class Snap extends CardGame {

    private final Player player1;
    private final Player player2;

    public Snap(String player1name, String player2name) {
        super(); // Creates a new shuffled deck
        this.player1 = new Player(player1name);
        this.player2 = new Player(player2name);

    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Card previousCard = null;
        boolean isPlayerOneTurn = true;

        System.out.println("Welcome to Snap!");
        System.out.println(player1.getName() + " VS " + player2.getName());
        System.out.println("Press Enter to draw cards. Match ranks to win!");

        while (!getDeck().isEmpty()) {
            Player currentPlayer = isPlayerOneTurn ? player1 : player2;
            System.out.print(currentPlayer.getName() + " Press Enter to deal a card...");
            scanner.nextLine(); // waits for Enter

            Card currentCard = dealCard();
            System.out.println(currentPlayer.getName() + " drew: " + currentCard);

            if (previousCard != null && currentCard.rank() == previousCard.rank()) {
                System.out.println("SNAP! " + currentPlayer.getName() + " wins!");
                return;
            }

            previousCard = currentCard;

            if (isPlayerOneTurn) {
                isPlayerOneTurn = false;
            } else {
                isPlayerOneTurn = true;
            }
        }

        System.out.println("No more cards. Game over.");
    }
}
