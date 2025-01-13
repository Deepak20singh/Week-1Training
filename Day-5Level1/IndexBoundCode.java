import java.util.Scanner;

public class IndexBoundCode {
	
	public static void generated(String s){
		
		String text=s;
		
		for(int i=0;i<(s.length()+10);i++){
		
		try{
		
		System.out.println("Character at "+i+" is "+s.charAt(i));
		}
		catch(Exception e){
			System.out.println("found an error :- "+e.getMessage());
	}
	}
	}
	
			
    public static void main(String[] args) {
		
		/*
		Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/ Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :- ");
String t= sc.nextLine();
System.out.println();

      generated(t);
		
           }
}


