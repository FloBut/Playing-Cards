package No_14_Playing_Cards;

import java.util.*;

//Scrie clasa Deck
//Atribute:
//•	Suit: o listă cu tipurile de cărți (ex: “trefla”, “rosu”, etc.)
//•	Rank: o listă cu numerele de cărți (ex: “2”, “3”, “as”)
//•	DeckCards: o listă de cărți
//Metode:
//GenerateDeck()
//•	Va popula lista de cărți (deckCards) în funcție de rank și suit, adică va genera String-uri cu toate combinațiile
// posibile (ex: “2 de trefla”, “as de rosu”, etc.), pe care le va adăuga în deckCards.
//suffleDeck()
//•	Va amesteca lista de cărți deckCards (hint: Collections.shuffle())


public class Deck {
    private List<String> suit; // declar o lista in care voi pune suit - urile declarate in enum ul SUIT
    private List<String> rank; // declar o lista in care voi pune rank - urile declatrate in enum ul Rank
    private List<String> deckCards;//lista in care voi salva cartea si tipul ei


    public Deck(List<String> suit, List<String> rank) {
        this.suit = suit;
        this.rank = rank;
        this.deckCards = new ArrayList<>();
        generateDeck();
    }



        //adaug in lista deckCards pentru cele 52 de carti fiecare suit cu rank - ul sau
        public void generateDeck() {
        for (int r = 0; r < rank.size(); r++) {//parcurg lista de rank - uri
            for (int s = 0; s < suit.size(); s++) {//parcurg lista de suituri si pentru fiecare suit voi adauga un rank
                deckCards.add(rank.get(r) + " of " + suit.get(s));
            }
        }
    }

    public void shuffleDeck() {
        //amestec listele de carti cu metoda shiffle() si le adaug in lista
        Collections.shuffle(deckCards);
    }
    public List<String> getDeckCards() {
        return deckCards;
    }

}
