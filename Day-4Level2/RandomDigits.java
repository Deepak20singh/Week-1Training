import java.util.Random;

public class RandomDigits {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];

        // Generating random 4-digit numbers (1000 to 9999)
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(9000) + 1000;  // Random number between 1000 and 9999
        }

        return numbers;
    }

    // Method to find the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3]; // To store average, min, and max

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculating sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        // Calculating average
        double average = sum / (double) numbers.length;

        // Storing results in the array
        result[0] = average;  // average
        result[1] = min;      // min
        result[2] = max;      // max

        return result;
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Find the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}

