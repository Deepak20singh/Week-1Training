import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
		//Create a program to find the multiplication table of a number entered by the user from 6 to 9.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

       
    }
}




