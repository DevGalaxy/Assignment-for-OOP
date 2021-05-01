
package com.company;

import java.util.Scanner;

public class Main {

        // Display Deck
    public static void main(String[] args) {

        DeckCards deck = new DeckCards();
        for (int suit = Cards.DIAMONDS; suit <= Cards.SPADES; suit++) {
            for (int rank = Cards.ACE; rank <= Cards.KING; rank++) {
                Cards card = deck.getCard(suit, rank);
                System.out.format(Cards.rankToString(card.getRank()) +" of "+Cards.suitToString(card.getSuit())+"\n");
            }
        }
        //Scanner myObj = new Scanner(System.in);
        //Scanner input = new Scanner(System.in);
       //wile(true)
       //  System.out.print("Please enter card type 1 for suits and 2 for ranks: ");
       //  int cardType = input.nextInt();
       //  switch (cardType)
       //  {
       //      case 1:
       //          System.out.println("ACE   =ACE =  1\nDEUCE = 2\nTHREE = 3\nFOUR  = 4\nFIVE  = 5\nSIX   = 6\nSEVEN = 7\nEIGHT = 8\nNINE  = 9\nTEN   = 10\nJACK  = 11\nQUEEN = 12\nKING  = 13");
       //          System.out.print("Enter Card Number : ");
       //          int rank = input.nextInt();
       //          if(Cards.isValidRank(rank))
       //              System.out.println(Cards.rankToString(rank));
       //          break;
       //      case 2:
       //          System.out.println("DIAMONDS = 1\n CLUBS    = 2\n HEARTS   = 3\n SPADES   = 4");
       //          System.out.print("Enter Card Number : ");
       //          int suit  = input.nextInt();
       //          if(Cards.isValidSuit(suit))
       //              System.out.println(Cards.suitToString(suit));
       //          break;
       //      default:
       //          System.out.println("Error Choice");
       //  }
       //  System.out.println("========================");


        }

    }

