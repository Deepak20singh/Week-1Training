
import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
		//Create a program to find all the multiple of a number taken as user input below 100.
        Scanner scanner = new Scanner(System.in);

         //Taking input
 System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Finding all multiples of the number below 100
        int num=number;
		int count=1;
		int mult=num*1;
		
		while(mult<101){
			
			System.out.println(mult);
			mult=num*count;
		count++;}
			
    }
}



