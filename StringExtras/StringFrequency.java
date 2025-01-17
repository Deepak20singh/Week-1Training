import java.util.Scanner;
import java.util.Arrays;

public class StringFrequency {
    
    public static char freqLogic1(String s) {
        int maxFreq = 0;
        char maxChar = '\0'; 
		
        //  array to count frequency 
        int[] freqArr = new int[256];  
        
        // Loop through the string and calculating the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqArr[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freqArr[i] > maxFreq) {
                maxFreq = freqArr[i];
                maxChar = (char) i; 
            }
        }

        return maxChar; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("\nEnter the string: ");
        String word1 = scanner.nextLine();

        // Output the most frequent character
        char result = freqLogic1(word1);
        System.out.println("The most frequent character is: " + result);
    }
}
