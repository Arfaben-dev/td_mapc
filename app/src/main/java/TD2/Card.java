public class Card {
    // Enum pour représenter les valeurs de la carte et la couleur
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Méthode pour obtenir la couleur (suit)
    public Suit getSuit() {
        return suit;
    }

    // Méthode pour obtenir le rang (rank)
    public Rank getRank() {
        return rank;
    }

    public int getSuitOrdinal() {
        return suit.ordinal();  // Renvoie l'index du suit
    }

    public int getRankOrdinal() {
        return rank.ordinal();  // Renvoie l'index du rank
    }
}

/*
Comparaison avec la solution vue en cours : Cette approche avec une seule énumération pour Suit et Rank 
est plus simple que d'avoir des classes séparées ou des constantes. Cependant, elle peut manquer 
de flexibilité si on souhaite ajouter plus de complexité dans les comportements des cartes.
*/
