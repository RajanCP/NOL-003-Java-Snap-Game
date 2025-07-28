public class Main {
    public static void main (String[]args){
        Card card = new Card (Rank.ACE, Suit.SPADES);
        System.out.println(card);
        CardGame game = new CardGame();
        game.createDeck();
        System.out.println(game.getDeck());
        Card dealt = game.dealCard();
        System.out.println("Dealt card: " + dealt);
        Card dealt2 = game.dealCard();
        System.out.println("Dealt card: " + dealt2);
        game.sortDeckinNumberOrder();
        System.out.println(game.getDeck());
        Card dealt3 = game.dealCard();
        Card dealt4 = game.dealCard();
        System.out.println("Dealt card: " + dealt3);
        System.out.println("Dealt card: " + dealt4);

    }
}
