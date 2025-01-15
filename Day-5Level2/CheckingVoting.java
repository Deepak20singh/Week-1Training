import java.util.Scanner;
import java.util.Random;

public class CheckingVoting {

    // to generate random ages for students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(83) + 10; // Random age between 10 and 92
        }
        return ages;
    }

    public static String[][] check(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            String eligibilityStatus = (ages[i] < 0) ? "Invalid Age" : (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            eligibility[i][0] = String.valueOf(ages[i]);
            eligibility[i][1] = eligibilityStatus;
        }
        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void display(String[][] eligibility) {
        for (int i = 0; i < eligibility.length; i++) {
            System.out.println("The voting eligibility:-"+ eligibility[i][0]+eligibility[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of students (in this case, 10 students)
        int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents);

        String[][] eligibility = check(ages);
 
        display(eligibility);
    }
}
