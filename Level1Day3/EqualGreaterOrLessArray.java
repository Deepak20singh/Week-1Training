
import java.util.Scanner;

public class EqualGreaterOrLessArray {
    public static void main(String[] args) {
		/*Write a program to take user input for 5 numbers and check whether a number is positive, 
		negative, or zero. Further for positive numbers check if the number is even or odd. Finally 
		compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less

*/
 Scanner sc = new Scanner(System.in);

        /* Ways to initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; */
		
       int[] arr =new int[5];		//declearing array
		
		
			
		
		for(int i=0;i<5;i++){
			System.out.print("\n Enter the number :- ");
			int k=sc.nextInt();
			//checking the number while taking input 
			if(k>0){
			arr[i]=k;
			if(arr[i]%2==0){
				System.out.println("The entered number is even");
			}
			else{
				System.out.println("The entered number is odd");
			
			}
			}
			else if(k<0){
				System.out.println("The entered number is negative");
		}
		else{
			System.out.println("The entered number is 0");
		}
		
	}
	if(arr[0]>arr[4]){
		System.out.println("\nThe first number is greater then second number");
	}
	else if(arr[0]<arr[4]){
	System.out.println("\nThe first number is lesser then second number");}
	else{
		System.out.println("\nThe first number and second number is equal");
	}
	
	}
}












