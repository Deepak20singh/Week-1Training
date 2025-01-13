
import java.util.Random;
import java.util.Scanner;

public class ScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];  // 3 columns for PCM (Physics, Chemistry, Maths)

        for (int i = 0; i < numStudents; i++) {
            // Generating random 2-digit scores for Physics, Chemistry, and Maths
            scores[i][0] = rand.nextInt(51) + 50;  // Random between 50 and 100 for Physics
            scores[i][1] = rand.nextInt(51) + 50;  // Random between 50 and 100 for Chemistry
            scores[i][2] = rand.nextInt(51) + 50;  // Random between 50 and 100 for Maths
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][5];  // 5 columns: total, average, percentage, grade, remarks

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Store results in the array
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;

            // Calculate Grade and Remarks
            String grade = getGrade(percentage);
            String remarks = getRemarks(grade);

            // Store grade and remarks
            results[i][3] = grade.charAt(0);  // Grade is stored as a char
            results[i][4] = remarks.charAt(0);  // Remarks is stored as the first character

            // Round the values to 2 decimal places using Math.round
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to determine the grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // Method to determine the remarks based on grade
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, below, but approaching agency-normalized standards";
            case "D":
                return "Level 1, well below agency-normalized standards";
            case "E":
                return "Level 1-, too below agency-normalized standards";
            case "R":
                return "Remedial standards";
            default:
                return "Invalid Grade";
        }
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student Scorecard");
                System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");  // Student Number
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%\t\t");
            System.out.print((char) results[i][3] + "\t");
            System.out.println(getRemarks(String.valueOf((char) results[i][3])));
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, percentage, grade, and remarks for each student
        double[][] results = calculateScores(scores, numStudents);

        // Display the scorecard
        displayScorecard(scores, results, numStudents);
    }
}

