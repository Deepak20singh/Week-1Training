import java.util.Scanner;

public class StringLength {

    public static int count(String s) {
        int num = 0;
        try {
            while (true) {
                s.charAt(num); // Access each character
                num++; 
            }
        } catch (Exception e) {
         
        }
        return num; // Return the count
    }

    public static void main(String[] args) {
        /*
         Write a program to find and return the length of a string without using the length() method.
         Hint =>
         Take user input using the Scanner next() method.
         Create a method to find and return a string's length without using the built-in length() method.
         The logic for this is to use an infinite loop to count each character until the charAt() method throws a runtime exception,
         handle the exception, and then return the count.
         The main function calls the user-defined method as well as the built-in length() method and displays the result.
        */

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Calling the user-defined method
        int calculatedLength = count(s);

        // Using the built-in length() method for verification
        int actualLength = s.length();

        // Displaying results
        System.out.println("Calculated length of the string: " + calculatedLength);
        System.out.println("Length of the string using built-in method: " + actualLength);

        
    }
}


