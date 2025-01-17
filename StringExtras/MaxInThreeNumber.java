import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MaxInThreeNumber {
	static void guess(){
		 Scanner sc = new Scanner(System.in);
       
		int k=2;
		int max=0;
		while(k>=0){
			System.out.print("Enter the number :- ");
		
			int input=sc.nextInt();
			System.out.println();
		
			if(input>max)
				max=input;
			k--;
		}
		System.out.println("The max number from above three numbers are "+max);
		
	}
			

    public static void main(String[] args) {
         /*Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
○ Ensure your program follows best practices for organizing code into modular
functions, such as separate functions for taking input and calculating the
maximum value.
*/

//calling game
        guess();
		}
}
