import java.util.Scanner;

public class StringCompare {
	
	public static boolean compare(String s,String k){
		boolean result=true;
		if(s.length()!=k.length()){
			result=false;
		}
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=k.charAt(i)){
				result=false;
			}
		}
		return result;
	}
			
    public static void main(String[] args) {
		
		/*
		Write a program to compare two strings using the charAt() method and check the result with the built-in String 
		equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 

*/
        Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the 1st word :- ");
        String word1 = scanner.nextLine();
        System.out.print("\nEnter the 2nd word :- ");
        String word2 = scanner.nextLine();
        System.out.println("Comparing using function :- "+compare(word1,word2));
		System.out.println("Comparing using equal function :- "+word1.equals(word2));
           }
}


