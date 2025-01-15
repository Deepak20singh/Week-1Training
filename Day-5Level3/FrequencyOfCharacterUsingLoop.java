import java.util.Scanner;

public class FrequencyOfCharacterUsingLoop {
//6.
     public static String[] freq(String text) {
        char[] characters = text.toCharArray();  
        int[] frequency = new int[characters.length];  // Array to store frequencies
        StringBuilder result = new StringBuilder();


 for (int i = 0; i < characters.length; i++) {
            
			if (characters[i] != '0') {
                int count = 1;  // Initialize count to 1 for the current character

                 for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;  
                        characters[j] = '0';  
                    }
                }

                // Storing the character and its frequency
                result.append("Character: ").append(characters[i]).append(" Frequency: ").append(count).append("\n");
            }
        }

        // Convert the result to an array of strings
        return result.toString().split("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] frequencies = freq(inputString);

        // result
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            if (!frequency.isEmpty()) {
                System.out.println(frequency);
            }
        }

        scanner.close();
    }
}