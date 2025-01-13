

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
		/*
		Create a program to check if a number is an Abundant Number.
Hint => 
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
*/
         Scanner scanner = new Scanner(System.in);

        //Taking input
        System.out.print("Enter a number: ");
        int number= scanner.nextInt();

        int sumOfDivisors = 0; 
		
        // for all divisors of the number
        for (int i = 1; i < ((number/2)+1); i++) {
            if (number% i == 0) {  // Checking if 'i' is a divisor
                sumOfDivisors += i;    // Adding "i' to the sum
            }
        }

        // Checking for abundant number
        if (sumOfDivisors > number) {
            System.out.println(number+ " is an Abundant number.");
        } else {
            System.out.println(number+ " is not an Abundant number.");
        }
    }
}



