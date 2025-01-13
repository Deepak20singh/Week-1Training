
import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
		/*Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___


*/
 Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the number :- ");
int number=sc.nextInt();
        /* Ways to initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; */
		
       int[] arr =new int[10];		//declearing array
		
		
			
		
		for(int i=0;i<10;i++){
			arr[i]=number*(i+1);
	
	   }
			for(int i=0;i<10;i++){
			System.out.print("\n"+number+" * "+(i+1)+" = "+arr[i]);//for output
	
	     }
	}
	
}












