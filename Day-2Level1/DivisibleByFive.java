import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
		//Write a program to check if a number is divisible by 5

        Scanner scanner = new Scanner(System.in);

        // input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

         }
}

