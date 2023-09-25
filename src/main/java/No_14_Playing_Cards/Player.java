package No_14_Playing_Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //scot intr-o lista apelul metodei shuffleDeck() in care ar trebui sa am pe pozitia para suit- ul si pe poz impara rank - ul;
    //in alta lista voi salva ultimele n + n carti, adica fiecare carte cu suit-ul si pozitia ei
    public List<String> dealHand(Deck deck, int cardsNumber) {
        List<String> dealHand = new ArrayList<>();
        List<String>  deckCard = deck.shuffleDeck();
        int startIndex = 52 - (2*cardsNumber);
        for (int i = startIndex; i <deckCard.size(); i++) {
            dealHand.add(deckCard.get(i));
        }


        //dealHand.add(deckCard.subList(startIndex,endIndex).toString());
        return dealHand;


    }
}
