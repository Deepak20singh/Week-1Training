import java.util.Scanner;

public class Day3Level1OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the user for input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Checking if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return; // Exit the program if invalid input
        }

        // Arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // variables to track positions in the arrays
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even numbers array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd numbers array
            }
        }

        
        System.out.println("Odd Numbers Array:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

       
        System.out.println("\nEven Numbers Array:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}