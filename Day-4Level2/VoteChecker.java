
import java.util.Scanner;

public class VoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate if the age is negative
        if (age < 0) {
            return false;  // Age is invalid, cannot vote
        }
        // If age is 18 or above, student can vote
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store the age of 10 students
        int[] ages = new int[10];
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Loop to get age input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            // Check if the student can vote
            if (voteChecker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        scanner.close();
    }
}








   


















