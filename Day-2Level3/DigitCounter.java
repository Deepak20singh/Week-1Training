import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
		/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits

		*/
		
         Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        //counter for tracking
        int count = 0;

         int numberToProcess = input;

        while (numberToProcess != 0) {
            numberToProcess /= 10; // Removing the last digit
            count++;          // Incrementing the counter
        }

        // result
        System.out.println("The number " + input + " having " + count + " digits.");
    }
}
