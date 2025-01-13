import java.util.Scanner;

public class Day3Level1FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables for factors array and its size
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is a factor
            if (number % i == 0) {
                // Resize the array if necessary
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old array to new
                    factors = temp;
                }
                factors[index++] = i; // Add factor to the array
            }
        }

        // Print the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
