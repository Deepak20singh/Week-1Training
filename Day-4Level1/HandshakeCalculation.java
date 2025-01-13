
import java.util.Scanner;

public class HandshakeCalculation {
   
    private int handshakesCalculator(int numberOfStudents){
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for the number of students and take user input
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
       
        //Creating the obj of the class handshakesCalculator
       
        HandshakeCalculatorFunction hand = new HandshakeCalculatorFunction();
       
        //Initializing the value of the function in the variable
       
       
        // Calculate the maximum number of handshakes using the method handshakesCalculator
        int maxHandshakes = hand.handshakesCalculator(numberOfStudents);

        // Print the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents
            + " students is " + maxHandshakes);

    }
}


