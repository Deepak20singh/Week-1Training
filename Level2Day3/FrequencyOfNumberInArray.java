
import java.util.Scanner;

public class FrequencyOfNumberInArray {
    public static void main(String[] args) {
		/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number



*/
 Scanner sc = new Scanner(System.in);
 System.out.print("\nEnter the number :- ");
		int n=sc.nextInt();
		
		int[] frequency= new int[10];
		
		
		int num=n,count=0;
		
		while(num!=0){
			int digit=num%10;
			num=num/10;
			
			frequency[digit]++;
		}
			

       
		   for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i] + " times");
                }
            }
	}
	
}












