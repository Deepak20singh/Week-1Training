import java.util.Scanner;

public class AnagramCode {
	//8.

     public static boolean anagram(String text1, String text2) {
        // If lengths are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays to store character counts
        int[] freq1 = new int[256];  // For text1
        int[] freq2 = new int[256];  // For text2

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;  
            }
        }

        return true;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        // Checking
        boolean result = anagram(text1, text2);

        // result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        
    }
}