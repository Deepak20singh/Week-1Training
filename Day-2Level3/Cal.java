import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
		/*
		Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/
         Scanner sc = new Scanner(System.in);

         //Taking input
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();

        // Performing the operation 
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
    }
}
