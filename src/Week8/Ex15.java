package Week8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex15 {
    // Exercise 15: Ex15 class
        public static void main(String[] args) {
            // Example for sorting hands
            Hand hand1 = new Hand();
            hand1.add(new Card(2, Card.SPADES));
            hand1.add(new Card(14, Card.CLUBS));
            hand1.add(new Card(12, Card.HEARTS));
            hand1.add(new Card(2, Card.CLUBS));

            Hand hand2 = new Hand();
            hand2.add(new Card(11, Card.DIAMONDS));
            hand2.add(new Card(11, Card.CLUBS));
            hand2.add(new Card(11, Card.HEARTS));

            int comparison = hand1.compareTo(hand2);

            if (comparison < 0) {
                System.out.println("The most valuable hand contains the cards:");
                hand2.print();
            } else if (comparison > 0) {
                System.out.println("The most valuable hand contains the cards:");
                hand1.print();
            } else {
                System.out.println("The hands are equally valuable");
            }

            // Example for sorting cards in optional orders
            ArrayList<Card> cards = new ArrayList<>();
            cards.add(new Card(3, Card.CLUBS));
            cards.add(new Card(2, Card.DIAMONDS));
            cards.add(new Card(14, Card.CLUBS));
            cards.add(new Card(12, Card.HEARTS));
            cards.add(new Card(2, Card.CLUBS));

            SortAgainstSuit suitSorter = new SortAgainstSuit();
            Collections.sort(cards, suitSorter);

            System.out.println("Sorted by suit:");
            for (Card c : cards) {
                System.out.println(c);
            }

            // Example for sorting hand against suit and value
            Hand hand3 = new Hand();
            hand3.add(new Card(12, Card.HEARTS));
            hand3.add(new Card(4, Card.CLUBS));
            hand3.add(new Card(2, Card.DIAMONDS));
            hand3.add(new Card(14, Card.CLUBS));
            hand3.add(new Card(7, Card.HEARTS));
            hand3.add(new Card(2, Card.CLUBS));

            System.out.println("Hand before sorting against suit and value:");
            hand3.print();

            hand3.sortAgainstSuit();

            System.out.println("Hand after sorting against suit and value:");
            hand3.print();
        }
    }

    // Exercise 15.1: Comparable Cards
    class Card implements Comparable<Card> {
        public static final int SPADES = 0;
        public static final int DIAMONDS = 1;
        public static final int HEARTS = 2;
        public static final int CLUBS = 3;

        private int value;
        private int suit;

        public Card(int value, int suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public int compareTo(Card other) {
            if (this.value == other.value) {
                return this.suit - other.suit;
            }
            return this.value - other.value;
        }

        public int getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};

            return values[value - 2] + " of " + suits[suit];
        }
    }

    // Exercise 15.2: Hand
    // Exercise 15.2: Hand
    class Hand implements Comparable<Hand> {
        private ArrayList<Card> cards;

        public Hand() {
            this.cards = new ArrayList<>();
        }

        public void add(Card card) {
            cards.add(card);
        }

        public void print() {
            for (Card card : cards) {
                System.out.println(card);
            }
        }

        // Exercise 15.3: Sorting the Hand
        public void sort() {
            Collections.sort(cards);
        }

        // Exercise 15.4: Comparing Hands
        @Override
        public int compareTo(Hand other) {
            int thisSum = this.cards.stream().mapToInt(Card::getSuit).sum();
            int otherSum = other.cards.stream().mapToInt(Card::getSuit).sum();
            return thisSum - otherSum;
        }

        // Exercise 15.6: Sort Against Suit
        public void sortAgainstSuit() {
            Collections.sort(cards, new SortAgainstSuitAndValue());
        }
    }

// Exercise 15.5: Sorting the Cards against Different Criteria
class SortAgainstSuit implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit() - card2.getSuit();
    }
}

// Exercise 15.6: Sort Against Suit
class SortAgainstSuitAndValue implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return card1.compareTo(card2);
        }
        return card1.getSuit() - card2.getSuit();
    }
}