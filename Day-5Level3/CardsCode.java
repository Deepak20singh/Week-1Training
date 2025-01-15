import java.util.*;

public class CardsCode {

    public static String[] baseDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;

         for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    //shuffle method
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        //using algo for shuffling
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);  // Get a random card number between i and n
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    //distribute function
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return null;
        }
        
        //array to store players and their cards
        String[][] playersCards = new String[numPlayers][numCards / numPlayers];

        int cardIndex = 0;
        
        // Distribution of cards
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // for printing
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] deck = baseDeck();
        
        //shuffle
        deck = shuffleDeck(deck);
        
        // taking input for no of player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter the number of cards each player should get: ");
        int numCardsPerPlayer = scanner.nextInt();
        
        int totalCards = numPlayers * numCardsPerPlayer;
        
        // Checking if the total cards can be easily distributed
        if (totalCards > deck.length) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        //distribute
        String[][] playersCards = distributeCards(deck, totalCards, numPlayers);

        // printing
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }

        scanner.close();
    }
}