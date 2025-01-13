
import java.util.Scanner;

public class CheckNumberPositiveNegativeZero {
    public static void main(String[] args) {
		//Write a program to check whether a number is positive, negative, or zero.

        Scanner sc = new Scanner(System.in);

        // Get a number as input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Determining if the number is +,- or 0
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }
}





