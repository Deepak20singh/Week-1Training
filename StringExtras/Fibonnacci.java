import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Fibonacci {
	static void check(int input){
		int[] arr=new int[input];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<input;i++){
		arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);}
		
				
	}
			

    public static void main(String[] args) {
         /*4. Fibonacci Sequence Generator.
*/

//calling game
Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter the number :- ");
		int input=sc.nextInt();
		
        check(input);
		}
}
