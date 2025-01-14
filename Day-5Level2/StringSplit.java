import java.util.Scanner;

public class StringLength {

    public static int count(String s) {
        int num = 0;
        try {
            while (true) {
                s.charAt(num); // Access each character
                num++; 
            }
        } catch (Exception e) {
         
        }
        return num; // Return the count
    }
    
     public static String[] splitText(String text) {
        int length = count(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int start = 0, index = 0;

        // Extract words using spaces 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i;
                words[index] = text.substring(start, end);
                index++;
                start = i + 1;
            }
        }

        return words;
    }
	
	  public static boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

	
    public static void main(String[] args) {
        /*
         Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result */

       Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] customSplit = splitText(input);

        String[] builtInSplit = input.split(" ");

        // Comparing the two results
        boolean areEqual = compare(customSplit, builtInSplit);

        // results
        System.out.println("Words using custom split method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are the two methods producing the same result? " + areEqual);

       
    }
        
    }



