import java.util.Scanner;

public class Day3Level1FizzBuzzInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

       if (number <= 0) {
            System.out.println("Error: Enter a positive integer.");
            return; // Exit the program if invalid input
        }

        String[] results = new String[number + 1];
       
	   
	     for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiple of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiple of 5
            } else {
                results[i] = Integer.toString(i); // Not a multiple of 3 or 5
            }
        }

        // Print the results array
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
