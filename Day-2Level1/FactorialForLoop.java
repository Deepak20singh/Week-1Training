
import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("The number is not a positive integer.");
        } else {
            int factorial = 1;

            // factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;


            }

            System.out.println("The factorial of " + num + " is " + factorial);
        }

           }
}






