import java.util.Scanner;

public class BodyMassIndex {

    // Method to calculate BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            double bmi = weight / (Math.pow(heightInMeters, 2)); // BMI formula
            personData[i][2] = bmi; // Store the BMI in the 3rd column
        }
    }

    // Method to determine the BMI status
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    // Method to display the BMI data
    public static void displayBMIData(double[][] personData, String[] status) {
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[10][3]; // 10 rows (persons), 3 columns (weight, height, BMI)

        // Taking input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            personData[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Enter height (in cm): ");
            personData[i][1] = scanner.nextDouble(); // Height
        }

        // Calculate BMI for all persons
        calculateBMI(personData);

        // Determine BMI status
        String[] status = determineBMIStatus(personData);

        // Display the results
        displayBMIData(personData, status);
    }
}

