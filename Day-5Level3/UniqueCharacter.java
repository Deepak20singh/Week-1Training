import java.util.Scanner;

public class UniqueCharacter {
//2.
    // Method for length
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception  
        }
        return length;
    }

    // Method for unique characters 
    public static char[] find(String text) {
        int length = findLength(text);
        char[] tempResult = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the result array
            for (int j = 0; j < uniqueCount; j++) {
                if (tempResult[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempResult[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find unique characters:");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = find(input);

        // Display the result
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }


    }
}