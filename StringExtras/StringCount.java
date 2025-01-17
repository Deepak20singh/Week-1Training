import java.util.Scanner;

public class StringCompare {
	
	public static int countVowel(String s){
		int result=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')){
				result++;
			}
		}
		return result;
	}
			
    public static void main(String[] args) {
		
		/*
		Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/
        Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the 1st word :- ");
        String word1 = scanner.nextLine();
		System.out.println("Counting the number of vowels :- "+countVowel(word1));
        System.out.println("Counting the number of consonantss :- "+(word1.length()-countVowel(word1)));
           }
}


