package No_14_Playing_Cards;

import java.util.ArrayList;
import java.util.List;

///Scrie clasa Player
////Atribute:
////•	name
////Metode:
////dealHand()
////•	Primește ca parametru un deck și numărul de cărți care se vor genera într-o “mână”.
////•	De exemplu, dacă numărul de cărți este 4, atunci funcția va returna
// o listă de genul: “[2 de trefla, 3 de rosu, 5 de negru, as de rosu]”.
////•	Această listă de fapt este o sublistă cu ultimele 4 cărți din lista de cărți (deckCards) a pachetului (deck)
// primit ca parametru. (hint: metoda subList())
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public List<String> dealHand(Deck deck, int cardsNumber) {
        List<String> newDealHand = new ArrayList<>();
        List<String> deckCards = deck.getDeckCards();
        if (cardsNumber <= deckCards.size()) {
            int startIndex = deckCards.size() - cardsNumber;
            int endIndex = deckCards.size();
            newDealHand = deckCards.subList(startIndex, endIndex);
        } else {
            System.out.println("Give a numbers of cards less then 52");
        }
        return newDealHand;


    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
