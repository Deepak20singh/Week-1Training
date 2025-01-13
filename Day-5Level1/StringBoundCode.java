import java.util.Scanner;

public class StringBoundCode {
	
	public static void generated(String s){
		
		String text=s;
		
		
		
		try{
		
		System.out.println("the subString is "+s.substring(9,4));
		}
		catch(IllegalArgumentException e){
			System.out.println("found an error :- "+e.getMessage());
	}
	}
	
	
			
    public static void main(String[] args) {
		
		/*
		Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


*/ Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :- ");
String t= sc.nextLine();
System.out.println();

      generated(t);
		
           }
}


