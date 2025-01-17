import java.util.Scanner;

public class StringMax {
	
	public static void minMax(String s){
		int mini=Integer.MAX_VALUE;
		int maxi=Integer.MIN_VALUE;
		String[][] name=splitText(s); // for extracting words
		int maxIndex=-1,minIndex=-1;
		
		 for (int i = 0; i < name.length; i++) {
            int length = Integer.parseInt(name[i][1]);
            if (length < mini) {
                mini = length;
                minIndex = i;
            }
            if (length > maxi) {
                maxi = length;
                maxIndex = i;
            }
        }
		System.out.println("The maximum length of word in the given string is "+name[maxIndex][1]+" and the word is "+name[maxIndex][0]);
		}
	
		

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

       
       
      minMax(input);
        }
}