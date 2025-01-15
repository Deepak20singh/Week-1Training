import java.util.Scanner;

public class NonRepeating {
//3.
    public static char findFirstNonRepeating(String text) {
     int[] frequency = new int[256];

        // Loop on text for frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop on text for first non repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  input
        System.out.println("Enter a string to find the first non-repeating character:");
        String input = scanner.nextLine();

        char result = findFirstNonRepeating(input);

        //result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        
    }
}