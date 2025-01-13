import java.util.Scanner;

public class StringToUppercaseExp {

    // Method to convert text to uppercase using ASCII logic
    public static String toUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase character to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch); // Keep non-lowercase characters unchanged
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
			return false; }
        }
        return true; // Strings are identical
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the text: ");
        String inputText = sc.nextLine();

        // Convert to uppercase using user-defined method
        String convertedText = toUpperCase(inputText);

        // Convert to uppercase using built-in method
        String builtInUpperCaseText = inputText.toUpperCase();

        // Compare the two results
        boolean areEqual = compareStrings(convertedText, builtInUpperCaseText);

        // Display results
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("User-Defined Text: " + convertedText);
        System.out.println("Built-In Text: " + builtInUpperCaseText);
        System.out.println(" both methods result comparision " + areEqual);

       
    }
}


