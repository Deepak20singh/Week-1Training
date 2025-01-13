import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
		//Write a program to check if the first is the smallest of the 3 numbers.

        Scanner scanner = new Scanner(System.in);

        // Taking three numbers as input
        System.out.print("Enter three numbers: \n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Checking if the first number is smaller than both second and third numbers
        boolean numberSmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest? " + numberSmallest);

      
    }
}

