public class Main {
    public static void main (String[]args){
        Card card = new Card ("A","♥", 14);
        System.out.println(card);           // Output: ♥A
        System.out.println("Suit: " + card.getSuit());
        System.out.println("Symbol: " + card.getSymbol());
        System.out.println("Value: " + card.getValue());
    }
}
