import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String s){
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result=result+s.charAt(i);
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
		System.out.println("Reverse of the string :- "+reverse(word1));
           }
}


