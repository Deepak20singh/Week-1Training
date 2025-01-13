import java.util.Scanner;

public class Day3Level2ReverseNumber {
    public static void main(String[] args) {
		/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order */

        Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :- ");
         int number=sc.nextInt();      //taking input
		 int temp=number;
		 int count=0;             //storing count
		 while(temp!=0){
			 temp/=10;
			 count++;
		 }
			 
			 
		 
        // for reverse number
		
        int[] num = new int[count];
		int i=0;
        while(number!=0){
			int k=number%10;
			number=number/10;
			num[i]=k;
			i++;
		}
			System.out.print("The number in reverse order is ");
			for(int j=0;j<count;j++){
				System.out.print(num[j]);
			}
			
    }
}