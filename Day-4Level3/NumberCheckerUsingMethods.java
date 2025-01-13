
import java.util.Arrays;

public class NumberCheckerUsingMethods {

    public static void main(String[] args) {
        int number = 28;  // Example number for testing

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        // Find the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        // Find the sum of the factors
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Find the product of the factors
        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Find the product of the cube of the factors
        double productOfCubes = productOfCubes(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Check if the number is perfect
        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);

        // Check if the number is abundant
        boolean isAbundant = isAbundantNumber(number);
        System.out.println(number + " is an abundant number: " + isAbundant);

        // Check if the number is deficient
        boolean isDeficient = isDeficientNumber(number);
        System.out.println(number + " is a deficient number: " + isDeficient);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println(number + " is a strong number: " + isStrong);
    }

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int[] tempFactors = new int[number];
        int count = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                tempFactors[count++] = i;
            }
        }
        int[] factors = new int[count];
        System.arraycopy(tempFactors, 0, factors, 0, count);
        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}


