import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Snap!");

        System.out.print("Enter Player 1 name: ");
        String player1name = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        String player2name = scanner.nextLine();
      Snap game = new Snap(player1name,player2name);
      game.startGameLoop();

    }
}
