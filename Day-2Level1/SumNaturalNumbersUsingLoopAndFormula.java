import java.util.*;

public class SumNaturalNumbersUsingLoopAndFormula {
    public static void main(String[] args) {
		//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
		 int sum = 0;
		int formulaSum = n*(n+1)/2;

        if (n < 1) {
            System.out.println("The number is not a natural number.");
        } else {
           
            // sum using while loop
            
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

          
                   }

           



            // Comparing results and print
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
            System.out.println("The results match: " + (formulaSum == sum));
        }

           }






