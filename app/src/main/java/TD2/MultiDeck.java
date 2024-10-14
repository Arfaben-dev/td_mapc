import java.util.ArrayList;
import java.util.List;

public class MultiDeck {
    private List<Deck> decks;

    public MultiDeck() {
        this.decks = new ArrayList<>();
    }

    // Constructeur par recopie (copie superficielle)
    public MultiDeck(MultiDeck original) {
        this.decks = new ArrayList<>(original.decks);  // Copie la référence des decks
    }

    // Constructeur par recopie (copie profonde)
    public MultiDeck deepCopy(MultiDeck original) {
        this.decks = new ArrayList<>();
        for (Deck deck : original.decks) {
            this.decks.add(new Deck(deck));  // Crée de nouveaux objets Deck
        }
    }
 
    public void addDeck(Deck deck) {
        decks.add(deck);
    }

    public List<Deck> getDecks() {
        return decks;
    }
}
