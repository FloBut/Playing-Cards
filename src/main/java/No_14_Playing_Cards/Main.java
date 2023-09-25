package No_14_Playing_Cards;
////Scrie clasa Main
////•	Aici se va construi array-ul suit, array-ul rank și se va construi un obiect de tip Deck (care va fi inițializat cu suit și rank).
////•	Se va genera pachetul.
////•	Se vor crea niște jucători și se vor adăuga într-o listă.
////•	Pentru fiecare jucător din listă, se va amesteca pachetul și se va apela metoda dealHand().


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player = new Player("Player1");
       System.out.println(deck.shuffleDeck().size());
        List<String> handForPlayer1 = player.dealHand(deck, 4);
        System.out.println(player.getName());
        System.out.println(handForPlayer1.size());
    }


}
