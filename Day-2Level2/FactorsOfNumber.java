
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
		//Create a program to find the factors of a number taken as user input.

          Scanner scanner = new Scanner(System.in);

        //Taking input

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Finding all factors of the number
        for (int i = 1; i <= ((number/2)+1); i++) {
            if (number % i == 0) { // Checking the factor
                System.out.print(i + " ");             }
        }
    }
}



