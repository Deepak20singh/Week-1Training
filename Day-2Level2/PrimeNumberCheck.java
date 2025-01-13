import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       //Taking input
  System.out.print("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true; // Assuming the number is prime

        //checking the condition
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { 
                    isPrime = false;
                    break;
                }
            }

            // result 
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}











