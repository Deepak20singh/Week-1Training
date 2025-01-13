import java.util.Scanner;

class DivideQuotient {
    public static void main(String args[]) {
        /* Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

     
        int number1,number2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        number1 = sc.nextInt();
		
		System.out.print("\nEnter the number2 : ");
        number2 = sc.nextInt();
	
	    int quotient=number1/number2;
		int reminder=number1%number2;

       
        // The result
        System.out.println("\n The Quotient is  " + quotient + " and Reminder is "+reminder+" of two number "+number1+" and "+number2);
    }
}
