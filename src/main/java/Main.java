public class Main {
    public static void main (String[]args){
        Card card = new Card (Rank.ACE, Suit.SPADES);
        System.out.println(card);
        CardGame game = new CardGame();
        game.createDeck();
        System.out.println(game.getDeck());

    }
}
