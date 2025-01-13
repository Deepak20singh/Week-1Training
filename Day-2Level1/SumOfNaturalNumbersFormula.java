import java.util.Scanner;

public class SumOfNaturalNumbersFormula {
    public static void main(String[] args) {
		/*Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 */


        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n >= 1) {
            // Use this formula n * (n + 1) / 2 to calculate the sum
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

     
    }
}
