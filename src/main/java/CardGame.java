import java.util.ArrayList;

public class CardGame {

    private final ArrayList<Card> deckOfCards = new ArrayList<>();

    public void createDeck() {
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card card = new Card(rank,suit);
                deckOfCards.add(card);
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
}
