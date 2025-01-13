

import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
		//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("The number is not a natural number.");
        } else {
            // sum using formula
            int formulaSum = n * (n + 1) / 2;

            // sum using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // results and print
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + sum);
            System.out.println("The results match: " + (formulaSum == sum));
        }

            }
}






