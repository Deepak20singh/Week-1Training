
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
		//Write a program to find the sum of numbers until the user enters 0
        Scanner scanner = new Scanner(System.in);

        // Initialize total to store the sum
        double total = 0.0;

        while (true) {
            // Ask the user to input a number
            System.out.print("Enter a number (0 to stop): ");
            double num = scanner.nextDouble();

            // Breaking the loop if the user enters 0
            if (num == 0) {
                break;
            }

            // Adding the number to the total
            total += num;
        }

        // Printing the total sum
        System.out.println("Total sum: " + total);

            }
}



