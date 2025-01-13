import java.util.Scanner;

public class StringSubStringCompare {
	
	public static String stringMaker(String s,int start,int end){
		String result="";
		
		for( int i=start;i<end;i++){
			result=result+s.charAt(i);
		}
		return result;
	}
			
			
    public static void main(String[] args) {
		
		/*
		Write a program to create a substring from a String using the charAt() method. Also, use the String built-in 
		method substring() to find the substring of the text. Finally Compare the the two strings and display the 
		results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get 
the substring from the given text.
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the 
parameters.
Write a method to compare two strings using the charAt() method and return a boolean result.
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the 
result.

*/
        Scanner sc = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the word :- ");
        String word1 = sc.nextLine();
        System.out.print("\nEnter the 1st index :- ");
        int firstIndex=sc.nextInt();
		System.out.print("\nEnter the 2nd index :- ");
        int SecondIndex=sc.nextInt();
		if(stringMaker(word1,firstIndex,SecondIndex).equals(word1.substring(firstIndex,SecondIndex)))
        System.out.println("The above 2 sub strings are equal or same \n"+stringMaker(word1,firstIndex,SecondIndex)+"\n"+word1.substring(firstIndex,SecondIndex) );//lst index is excluded
		else
		System.out.println("The above 2 sub strings are not equal or not same \n"+stringMaker(word1,firstIndex,SecondIndex)+"\n"+word1.substring(firstIndex,SecondIndex));//lst index is excluded
		
           }
}


