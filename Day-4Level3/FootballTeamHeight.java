
import java.util.Random;

public class FootballTeamHeight {

    public static void main(String[] args) {
        // Step 1: Create an array to store heights of 11 players
        int[] heights = new int[11];

        // Step 2: Populate the array with random heights in the range [150, 250]
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Random height between 150 and 250
        }

        // Step 3: Display the heights of the players
        System.out.println("Heights of the players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Step 4: Calculate the required values
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Step 5: Display the results
        System.out.println("Total sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int height : array) {
            sum += height; // Add each height to the sum
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int numberOfPlayers) {
        // Mean is sum divided by the number of players
        return (double) sum / numberOfPlayers;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int shortest = array[0]; // Assume the first height is the shortest
        for (int height : array) {
            if (height < shortest) {
                shortest = height; // Update shortest if a smaller height is found
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int tallest = array[0]; // Assume the first height is the tallest
        for (int height : array) {
            if (height > tallest) {
                tallest = height; // Update tallest if a larger height is found
            }
        }
        return tallest;
    }
}


