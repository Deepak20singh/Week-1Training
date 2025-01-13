import java.util.Scanner;

public class TextManipulation {

    public static String toLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase character to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch); // Keep non-uppercase characters unchanged
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, strings are not equal
            }
        }
        return true; // Strings are identical
    }

    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split("\\s+"); 
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(words[i].length()); 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String inputText = sc.nextLine();

        // Converting to lowercase 
        String convertedText = toLowerCase(inputText);

        String builtInLowerCaseText = inputText.toLowerCase();

        boolean areEqual = compareStrings(convertedText, builtInLowerCaseText);

        String[][] wordsAndLengths = splitTextIntoWords(inputText);

        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("User-Defined Text: " + convertedText);
        System.out.println("Built-In Text: " + builtInLowerCaseText);
        System.out.println("both methods results on comparision " + areEqual);

        System.out.println("\nWords and their lengths:");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println("Word: " + wordAndLength[0] + ", Length: " + wordAndLength[1]);
        }

        sc.close();
    }
}



