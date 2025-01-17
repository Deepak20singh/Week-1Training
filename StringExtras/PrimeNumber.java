import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class PrimeNumber {
	static void check(int input){
		boolean result=true;
		
		
		for(int i=2;i<Math.sqrt(input)+1;i++){
			if(input%i==0){
				result=false;
			}
		}
		System.out.print("The given is "+((result)?"prime":"not prime"));
		
				
	}
			

    public static void main(String[] args) {
         /*3. Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. ○
The program should use a separate function to perform the prime check and
return the result.
*/

//calling game
Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter the number :- ");
		int input=sc.nextInt();
		
        check(input);
		}
}
