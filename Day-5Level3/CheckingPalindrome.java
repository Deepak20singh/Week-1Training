import java.util.Scanner;

public class CheckingPalindrome {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        // comparing
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
			return false;  }
            start++;
            end--;
        }
        return true; 
    }

    // Recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //  using arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();  // Converting string to character array
        char[] reverseArray = new char[originalArray.length];  // Creating an array for reversed string
        
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - i - 1];
        }
        
        // Comparing
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        
        // Removing spaces & converting to lower case 
        inputText = inputText.replaceAll("\\s", "").toLowerCase();

        boolean resultIterative = isPalindromeIterative(inputText);
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean resultArray = isPalindromeUsingArray(inputText);

        //  result
        System.out.println("Palindrome check using iterative method: " + resultIterative);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);
        System.out.println("Palindrome check using character arrays: " + resultArray);

        
    }
}