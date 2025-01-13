
import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

         //Taking input
       System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = scanner.nextInt();

        // Checking if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; 
            //while loop 
            while (i <= number) {
                // Check conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); 
                }
                i++; // Incrementing the counter
            }
        }
    }
}










