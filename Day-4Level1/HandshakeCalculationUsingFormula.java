import java.util.Scanner;

public class HandshakeCalculationUsingFormula {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

         if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative.");
        } else {
            // Calculating the maximum number of handshakes using the formula
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Result
            System.out.println("The maximum number of handshakes is: " + maxHandshakes);
        }

                   }
}
