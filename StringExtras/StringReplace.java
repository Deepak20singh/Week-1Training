import java.util.Scanner;
import java.util.Arrays;

public class StringReplace {
	public static int count(String s) { //for length
        int num = 0;
        try {
            while (true) {
                s.charAt(num); // Access each character
                num++; 
            }
        } catch (Exception e) {
            }
        return num; 
    }
    
     public static String[] splitText(String text) {
        int length = count(text);
        int wordCount = 1; // At least one word exists
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount]; // array to store word and its length
        int start = 0, index = 0;

        // Extract words using spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i;
                words[index] = text.substring(start, end); // Word
                index++;
                start = i + 1;
            }
        }

        return words;
    }
	
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a replace method in Java that replaces a given word with another word in a sentence:
        // Input from user
        System.out.print("\nEnter the sentence: ");
        String sentence = scanner.nextLine();
		
		System.out.print("\nEnter the 1st word: ");
        String word1 = scanner.nextLine();

        System.out.print("\nEnter the 2nd word: ");
        String word2 = scanner.nextLine();
		
		String[] str=splitText(sentence);
		String res="";
		
		for(int i=0;i<str.length;i++){
         if (str[i].equals(word1)) {
                str[i] = word2; // Replace the word
            }
            res += str[i] + " "; 
        }
		
		
        res=res.trim();

        System.out.println("The resultant ans is: "+res);
    }
}
