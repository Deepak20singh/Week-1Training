import java.util.Scanner;

public class StringSubStringUsingCharCompare {
	
	public static char[] stringMaker(String s){
		char[] result =new char[s.length()];
		
		for(int i=0;i<s.length();i++){
			
			result[i]=s.charAt(i);
		
		}
		return result;
	}
			
			
    public static void main(String[] args) {
		
		/*
		Write a program to return all the characters in a string using the user-defined method,  compare the result with
		the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable

Write a method to return the characters in a string without using the toCharArray() 

Write a method to compare two string arrays and return a boolean result

In the main() call the user-defined method and the String built-in ​​toCharArray() method, 
compare the 2 arrays, and finally display the result*/


        Scanner sc = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the word :- ");
        String word1 = sc.nextLine();
        boolean r=true;
		char[] res=word1.toCharArray();
		char[] ans=stringMaker(word1);
		for(int i=0;i<word1.length();i++){
			if(ans[i]!=res[i]){
				r=false;
			}
		}
		for(int i=0;i<word1.length();i++){
			System.out.println(ans[i]);
				
		}
		for(int i=0;i<word1.length();i++){
			System.out.println(res[i]);
				
		}
			System.out.println(r);
		
		
           }
}


