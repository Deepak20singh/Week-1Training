import java.util.Scanner;

public class FrequencyOfCharacter {
	//4.

    // Method for frequency of characters in a string
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their freq
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Populate the 2D array with characters and their freq
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string :");
        String input = scanner.nextLine();

        String[][] freq = findFrequency(input);

        //result 
        System.out.println("Character Frequency");
        System.out.println
        for (String[] row : freq) {
            System.out.println(+ row[0] + "   " + row[1]);
        }

        
    }
}