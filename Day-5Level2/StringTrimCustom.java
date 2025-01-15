import java.util.Scanner;

public class StringTrimCustom {

    public static int[] trim(String s) {
        int start = 0, end = s.length() - 1;

        // Find the first non-space character
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 for inclusive range
    }

    public static String custom(String s) {
        int[] arr = trim(s);
        int start = arr[0];
        int end = arr[1];

        String res = "";
        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    // Method to compare two strings
    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // Mismatch found, no need to continue
            }
        }

        return true;
    }

    public static void main(String args[]) {
		/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :- ");
        String s = sc.nextLine();

        String trimmedBuiltIn = s.trim();
        String trimmedCustom = custom(s);

        System.out.println("Trim using built-in method :- \"" + trimmedBuiltIn + "\"");
        System.out.println("Trim using custom method :- \"" + trimmedCustom + "\"");
        System.out.println("Comparison between both the trims :- " + compare(trimmedBuiltIn, trimmedCustom));
    }
}
