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
    private List<String> suit;
    private List<String> rank;
    private Map<List<String>, List<String>> deckCards = new HashMap<>();//este o mapa in care cheile sunt lista de suit - uri
    // si valorile corespunzatoare cheilor sunt lista de rank - uri

    //suit - urile m-am gandit sa le introduc intr- o calasa de tip  enum

    public Deck() {
        this.suit = suit;
        this.rank = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
        this.deckCards = new HashMap<>();
    }

    public List<String> getSuit() {
        return suit;
    }

    public void setSuit(List<String> suit) {
        this.suit = suit;
    }

    public List<String> getRank() {
        return rank;
    }

    public void setRank(List<String> rank) {
        this.rank = rank;
    }

    public Map<List<String>, List<String>> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(Map<List<String>, List<String>> deckCards) {
        this.deckCards = deckCards;
    }

    //ma folesesc de o mapa in care cheile vor fi tipurile de carti (suit) si rank - uile vor fi valorile corespunzatoare cheilor
    public void GenerateDeck() {
       for (int i = 0; i < 52; i++) {//pentru fiecare din cele 52 de tipuri de carti
         for (int s = 0; s < suit.size(); s++) {//parcurg lista de suituri si pentru fiecare suit voi adauga un rank
             for (int r = 0; r < rank.size(); r++) {//parcurg lista de rank - uri
                 deckCards.put(Collections.singletonList(suit.get(s)), Collections.singletonList(rank.get(r)));//le pun in mapa
             }
         }
       }
    }
    //extrag in liste din nou keile mapei si  amestec lista
    //extrag in lista din nou valorile corespunzataore keilor si amestec lista
    // adaug listele de suit si rank in nou lista pe care o returnez



    //AICI CRED CA ESTE PROBLEMA
    public List<String> shuffleDeck() {
        List <String> suitAndRank = new ArrayList<>();
        List<String> suitList = new ArrayList<>();
        List<String> rankList = new ArrayList<>();
        for (Map.Entry<List<String>, List<String>> entry : deckCards.entrySet()) {
            suitList.add(deckCards.keySet().toString());
            rankList.add(deckCards.get(deckCards.keySet()).toString());

        }
    //amestec listele de carti cu metoda shiffle() si le adaug in lista
        Collections.shuffle(suitList);
        Collections.shuffle(rankList);

        // pe pozitia para voi pune suit - urile
        //pe pozitia impara voi pune rank - urile
        for (int j = 0; j < suitList.size(); j++) {
            String suitforCards = (suitList.get(j));
            int i = 0;
             while (i < 26) {
                 suitAndRank.add(suitforCards);
                 suitAndRank.add(rankList.get(i));
                 i+=2;
             }

        }
        return suitAndRank;
    }


}
