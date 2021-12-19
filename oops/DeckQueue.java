package com.bridgelabz.objectOriented;
/**Purpose: This program is to display deck cards using
 * Queue.
 */
public class DeckQueue {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String array[][] = new String[4][9];

        // initialize deck
        int numberOfCards = suits.length * ranks.length;
        String[] deck = new String[numberOfCards];

        // initialize deck
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
                System.out.print(""+(deck[suits.length*i + j]));
            }
        }

        // shuffle cards
        for (int i = 0; i < numberOfCards; i++) {
            int random = i + (int) (Math.random() * (numberOfCards - i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }

        QueueDeck queueDeck = new QueueDeck();
        // distribute 9 cards to 4 player
        for (int i = 0; i < 4; i++) {
            System.out.print("Player" + (i + 1) + "\n");
            for (int j = 0; j < 9; j++) {
                array[i][j] = (deck[i + j * 4]);
                System.out.println(" " + array[i][j]);
                queueDeck.push(array[i][j]);
                // System.out.println("" + queue);
            }
            System.out.println("\n");
        }
    }
}

