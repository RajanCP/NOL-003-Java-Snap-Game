import java.util.ArrayList;

public class CardGame {

    private final String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"}; // ♥ ♦ ♣ ♠
    private final String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private final ArrayList<Card> deckOfCards = new ArrayList<>();

    public void createDeck() {
        for (String suit: suits){
            for (int i = 0; i < symbols.length; i++) {
                String symbol = symbols[i];
                int value = i + 2; // 2 - 14
                Card card = new Card(symbol, suit, value);
                deckOfCards.add(card);

            }

        }

    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
}
