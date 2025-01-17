import java.util.Scanner;

public class CalculatorSimple {

    // Addition method
    static double add(double input1, double input2) {
        return input1 + input2;
    }

    // Subtraction method
    static double sub(double input1, double input2) {
        return input1 - input2;
    }

    // Multiplication method
    static double mul(double input1, double input2) {
        return input1 * input2;
    }

    // Division method
    static double div(double input1, double input2) {
        if (input2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  
        }
        return input1 / input2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the first number
        System.out.println("Enter the first number:");
        double input1 = sc.nextDouble();

        // Input the second number
        System.out.println("Enter the second number:");
        double input2 = sc.nextDouble();

         sc.nextLine();  
      \  System.out.println("Enter operation (+, -, *, /):");
        String op = sc.nextLine().trim();  
		
        switch (op) {
            case "+":
                System.out.println("The addition of numbers is " + add(input1, input2));
                break;
            case "-":
                System.out.println("The subtraction of numbers is " + sub(input1, input2));
                break;
            case "*":
                System.out.println("The multiplication of numbers is " + mul(input1, input2));
                break;
            case "/":
                double result = div(input1, input2);
                if (!Double.isNaN(result)) {
                    System.out.println("The division of numbers is " + result);
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter one of +, -, *, /.");
        }

     
    }
}
