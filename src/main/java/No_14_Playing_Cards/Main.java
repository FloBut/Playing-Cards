package No_14_Playing_Cards;
////Scrie clasa Main
////•	Aici se va construi array-ul suit, array-ul rank și se va construi un obiect de tip Deck (care va fi inițializat cu suit și rank).
////•	Se va genera pachetul.
////•	Se vor crea niște jucători și se vor adăuga într-o listă.
////•	Pentru fiecare jucător din listă, se va amesteca pachetul și se va apela metoda dealHand().


import org.w3c.dom.ls.LSException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> suit = List.of( "Clubs", "Diamonds", "Hearts", "Spades");
        List<String> rank = List.of("ace", "two", "tree", "four", "five", "six", "seven", "eight", "nine",  "ten",
                "Jack", "Queen", "King");
        Deck deck = new Deck(suit, rank);
        Player player = new Player("John");
        deck.generateDeck();
        deck.shuffleDeck();
        List <String> hand = player.dealHand(deck, 3);
        System.out.println(player + "with cards" + hand);
    }


}
