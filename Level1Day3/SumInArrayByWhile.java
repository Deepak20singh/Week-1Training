
import java.util.Scanner;

public class SumInArrayByWhile {
    public static void main(String[] args) {
		/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters
		a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
.Create a variable to store an array of 10 elements of type double as well as a variable to store the total 
 of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
.Use infinite while loop as in while (true)
.Take the user entry and check if the user entered 0 or a negative number to break the loop 
.Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
.If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
.Take another for loop to get the values of each element and add it to the total 
 Finally display the total value


*/
 Scanner sc = new Scanner(System.in);

        /* Ways to initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] arr = new int[3][3];
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; */
		
       double[] arr =new double[10];		//declearing array
	   
		double sum=0;
		int i=0;
		
			while(true){
                System.out.print("\nEnter the "+(i+1)+" number :- ");
				double k=sc.nextDouble();
				if(k>0){
					arr[i]=k;
					sum=sum+arr[i];
				}
				else{
					break;
				}
				i++;
			}
			System.out.println("The sum of digits is "+sum);
	}
	
}












