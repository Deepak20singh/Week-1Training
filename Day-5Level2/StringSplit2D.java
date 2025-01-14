import java.util.Scanner;

public class StringLength {

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
    
    public static String[][] splitText(String text) {
        int length = count(text);
        int wordCount = 1; // At least one word exists
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[][] words = new String[wordCount][2]; // 2D array to store word and its length
        int start = 0, index = 0;

        // Extract words using spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i;
                words[index][0] = text.substring(start, end); // Word
                words[index][1] = String.valueOf(count(text.substring(start, end))); // Length
                index++;
                start = i + 1;
            }
        }

        return words;
    }
    
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] customSplit = splitText(input);

       
        System.out.println("\nWords using custom split method:");
        for (String[] word : customSplit) {
            System.out.println("Word : " + word[0] + ", Length : " + word[1]);
        }

        }
}
