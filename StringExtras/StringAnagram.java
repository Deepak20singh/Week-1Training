import java.util.Scanner;
import java.util.Arrays;

public class StringAnagram {
    
    public static boolean anagram(String s,String s2) {
		int arr[]=new int[256];
		Arrays.fill(arr,0);
		
		if (s.length() != s2.length()) {
            return false;
        }
		 for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
		 }
		for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i)]--;
           
		   if (arr[s2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("\nEnter the string: ");
        String word1 = scanner.nextLine();
		
        System.out.print("\nEnter the second string: ");
        String word2 = scanner.nextLine();


        // Output the most frequent character
        boolean result = anagram(word1,word2);
        System.out.println("The resultant ans is: "+result);
    }
}
