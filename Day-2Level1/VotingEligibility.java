import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
		//Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

        Scanner scanner = new Scanner(System.in);

        // Taking age as input from the user
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

          }
}




