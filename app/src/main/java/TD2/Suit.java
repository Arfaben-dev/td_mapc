public enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public String color() {
        switch (this) {
            case HEARTS:
            case DIAMONDS:
                return "Rouge";
            case CLUBS:
            case SPADES:
                return "Noir";
            default:
                return "Inconnu";
        }
    }
}
