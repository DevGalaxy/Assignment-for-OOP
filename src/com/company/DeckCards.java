package com.company;

public class DeckCards {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Cards[][] cards;

    public DeckCards() {
        cards = new Cards[numSuits][numRanks];
        for (int suit = Cards.DIAMONDS; suit <= Cards.SPADES; suit++) {
            for (int rank = Cards.ACE; rank <= Cards.KING; rank++) {
                cards[suit-1][rank-1] = new Cards(rank, suit);
            }
        }
    }

    public Cards getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}
