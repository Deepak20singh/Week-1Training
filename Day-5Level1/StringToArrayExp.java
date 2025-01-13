import java.util.Scanner;
import java.lang.Integer;

public class StringToArrayExp {
	
	public static void generated(String[] s){
		
		for(int i=0;i<(s.length+4);i++){
		
		try{
		
		System.out.println("The name of "+i+" person is :- "+s[i]);
		}
		catch(RuntimeException e){
			System.out.println("found an error :- "+e.getMessage());
	}
	
		}
	}
	
	
			
    public static void main(String[] args) {
		
		/*
		Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


*/ Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of names :- ");
int nam=sc.nextInt();
sc.nextLine();
String[] names=new String[nam];

  for (int i = 0; i < nam; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

		generated(names);
           }
}


