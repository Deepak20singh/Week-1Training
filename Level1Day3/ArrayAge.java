
import java.util.Scanner;

public class ArrayAge {
    public static void main(String[] args) {
		/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.

*/
 Scanner sc = new Scanner(System.in);

        /* Ways to initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; */
		
        System.out.print("\nEnter the number of student:- ");
        int size=sc.nextInt(); //for size 
		int[] arr =new int[size];		//declearing array
		
		
			
		
		for(int i=0;i<size;i++){
			System.out.print("\n Enter the age of "+(i+1)+ " student :- ");
			int k=sc.nextInt();
			//checking the age while taking input 
			if(k>=0){
			arr[i]=k;
			if(arr[i]>=18){
				System.out.println("The student with the age "+arr[i]+" can vote.");
			}
			else{
				System.out.println("The student with the age "+arr[i]+" cannot vote.");
			
			}
			}
			else{
				System.out.println("Invalid age entered");
				break;
		}
		
	}}
}












