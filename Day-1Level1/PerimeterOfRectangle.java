import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String args[]) {
        /* Write a program to find the side of the square whose perimeter you read from user
           Hint => Perimeter of Square is 4 times side
           I/P => perimeter
           O/P => The length of the side is ___ whose perimeter is ____ 
        */

        // Declare variables
        int perimeter;

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square : ");
        perimeter = sc.nextInt();

        // Calculate the side length
        int length = perimeter / 4;

        // Output the result
        System.out.println("\nThe length of the side is " + length + " feet whose perimeter is " + perimeter + " feet.");
    }
}
