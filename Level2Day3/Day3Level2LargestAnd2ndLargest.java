import java.util.Scanner;

public class Day3Level2LargestAnd2ndLargest {
    public static void main(String[] args) {
		/*Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/

        Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :- ");
         int number=sc.nextInt();      //taking input
			 
			 
		 
        // for storing number
		
        int[] arr = new int[10];
		int m=0;
        while(number!=0){
			int k=number%10;
			number=number/10;
			arr[m]=k;
			m++;
		}
			int larg=0;
		int sLarg=0;
		for(int i=0;i<10;i++){
		if(arr[i]>larg)
		{sLarg=larg;
			larg=arr[i];
		}
		if((arr[i]<larg)&&arr[i]>sLarg)
			sLarg=arr[i];


	}
	System.out.println("Largest number is: "+larg+" second largest is: "+sLarg);
	
			
    }
}