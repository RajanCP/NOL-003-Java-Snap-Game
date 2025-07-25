public class Main {
    public static void main (String[]args){
        Card card = new Card ("A","♥", 14);
        System.out.println(card);           // Output: ♥A
        System.out.println("Suit: " + card.suit());
        System.out.println("Symbol: " + card.symbol());
        System.out.println("Value: " + card.value());

        CardGame game = new CardGame();
        game.createDeck();
        System.out.println(game.getDeck());

    }
}
