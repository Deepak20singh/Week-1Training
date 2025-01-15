import java.util.Scanner;

public class FrequencyOfCharacter2{
//5.
    public static char[] unique(String text) {
        boolean[] visited = new boolean[256];  // ASCII size
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];  // Array for storing frequency of ASCII characters

         for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
		

           //for unique
        char[] uniqueChars = unique(text);
        String[][] result = new String[uniqueChars.length][2];  // 2D array for storing result

        // Storing the characters and their frequencies in array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);  // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[][] frequencies = findFrequency(inputString);

        // Displaying the result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Character: " + frequencies[i][0] + " Frequency: " + frequencies[i][1]);
        }

        scanner.close();
    }
}