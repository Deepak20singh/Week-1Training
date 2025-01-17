import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Factorial {
	static int factorial(int input){
		if(input==0){
		return 1;}
		else if(input==1){
			return 1;
		}
		else{
		return (input*factorial(input-1));
		}
				
	}
			

    public static void main(String[] args) {
         /*4. Fibonacci Sequence Generator.
*/

//calling game
Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter the number :- ");
		int input=sc.nextInt();
		
        int ans=factorial(input);
		System.out.println("The factorial of number is "+ans);
		}
}
