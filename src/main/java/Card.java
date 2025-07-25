public class Card {
    private final String suit;
    private final String symbol;
    private final int value;

    public Card(String symbol, String suit, int value) {
        this.symbol = symbol;
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() { // Runs Card.toString when you call card (since it expects an object)
        return suit + symbol;
    }
}
