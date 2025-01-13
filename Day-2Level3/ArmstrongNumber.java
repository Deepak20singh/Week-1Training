import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
		/*Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
*/
          Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Initializing variables
        int sumOfCubes = 0;  // sum
        int originalNumber = inputNumber; 
		
		int countNumber = inputNumber; 
		int power=0;
		
		//for counting power
		while(countNumber!=0){
			countNumber/=10;
		power++;}
			
			

        // Process each digit of the number
        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;  
            sumOfCubes += Math.pow(lastDigit,power); 
            originalNumber /= 10;                 // Removing the last digit 
        }

        // Checking for the armstrong
        if (sumOfCubes == inputNumber) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }
    }
}
