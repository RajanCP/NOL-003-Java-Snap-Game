public record Card(String symbol, String suit, int value) {

    @Override
    public String toString() { // Runs Card.toString when you call card (since it expects an object)
        return suit + symbol;
    }
}
