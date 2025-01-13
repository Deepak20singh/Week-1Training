import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Method to check if a number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check whether the number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println("Number " + (i + 1) + ": " + num);

            // Check if the number is positive, negative, or zero
            String posNeg = isPositive(num);
            System.out.println(posNeg);

            // If positive, check if it's even or odd
            if (posNeg.equals("Positive")) {
                String evenOdd = isEven(num);
                System.out.println(evenOdd);
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);

        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }

        scanner.close();
    }
}
