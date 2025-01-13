
import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
		//Write a Program to find the factorial of an integer entered by the user.

        Scanner scanner = new Scanner(System.in);
//Taking input from user
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("The number is not a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

            }
}






