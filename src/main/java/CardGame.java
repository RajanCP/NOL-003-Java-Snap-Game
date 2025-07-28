import java.util.ArrayList;
import java.util.Comparator;

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


    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0);
        } else {
            return null;
        }
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparingInt(card -> card.rank().getValue()));
        return deckOfCards;
    }
}
