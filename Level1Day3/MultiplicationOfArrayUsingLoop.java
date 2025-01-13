
import java.util.Scanner;

public class MultiplicationOfArrayUsingLoop {
    public static void main(String[] args) {
		/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 
		and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___



*/
 Scanner sc = new Scanner(System.in);

        /* Ways to initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] arr = new int[3][3];
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; */
		
		int arr[]=new int[10];
		
		System.out.print("\nEnter the number :- ");
		int n=sc.nextInt();
		
       int[] multiplicationResult =new int[10];		//declearing array
	   if(n>5&&n<10){
		   for(int i=0;i<10;i++){
			   arr[i]=n*(i+1);
			    System.out.println(n+" * "+(i+1)+" = "+arr[i]);
		   }
		   
		   
	   }
	   else{
		   System.out.println("Enter no between 6 to 9");
	   }
		
			
			
	}
	
}












