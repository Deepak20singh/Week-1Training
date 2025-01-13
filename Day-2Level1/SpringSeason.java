
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
		/*Write a program SpringSeason that takes two int values month
		and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”*/
        Scanner scanner = new Scanner(System.in);

        // Taking month and day from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Checking if the date falls in the spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

            }
}





