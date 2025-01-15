import java.util.Random;
import java.util.Scanner;

public class Scores {

    // Method to generate random 2-digit scores for PCM
    public static int[][] score(int noOfStudents) {
        Random ran = new Random();
        int[][] scores = new int[noOfStudents][3];

        for (int i = 0; i < noOfStudents; i++) {
            scores[i][0] = ran.nextInt(100); // Physics: 0-100
            scores[i][1] = ran.nextInt(100); // Chemistry: 0-100
            scores[i][2] = ran.nextInt(100); // Math: 0-100
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int noOfStudents = scores.length;
        double[][] results = new double[noOfStudents][3];

        for (int i = 0; i < noOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage
        }

        return results;
    }

    // Method to assign grades and display results
    public static void grade(int[][] scores, double[][] results) {
        int noOfStudents = scores.length;

        
        for (int i = 0; i < noOfStudents; i++) {
            String grade;
            String remark;
            double percentage = results[i][2];

            // Grade assignment based on percentage
            if (percentage >= 80) {
                grade = "A";
                remark = "above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remark = "at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remark = "below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remark = "well below agency-normalized standards";
            }  else if (percentage >= 40) {
                grade = "E";
                remark = "too below agency-normalized standards";
            } else {
                grade = "R";
                remark = "Remedial standards";
            }

            System.out.println("The score of "+(i+1)+" student is "+results[i][0]+" with "+grade+" grade and "+percentage+"% ,The remark :-"+remark);
                 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int noOfStudents = sc.nextInt();

        // Generating scores
        int[][] scores = score(noOfStudents);

        // Calculating results
        double[][] results = calculateResults(scores);

        grade(scores, results);
    }
}

