import java.util.Scanner;

public class PercentagesInArray {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of students :- ");
        int num = sc.nextInt();

        int[] marks = new int[num];
        double[] percentages = new double[num]; 
        char[] grades = new char[num];

        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the physics marks of student " + (i + 1) + " :- ");
            int phy = sc.nextInt();
            System.out.print("\nEnter the chemistry marks of student " + (i + 1) + " :- ");
            int chem = sc.nextInt();
            System.out.print("\nEnter the math marks of student " + (i + 1) + " :- ");
            int math = sc.nextInt();
            int sum = phy + chem + math; // Calculating total marks

            marks[i] = sum;
            percentages[i] = (double) sum / 300 * 100; // Calculating percentage 

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }

            System.out.println("\nRecord Saved! ");
        }

        for (int i = 0; i < num; i++) {
            System.out.println("\nThe Marks of student " + (i + 1) + " is " + marks[i] + 
                               " and his/her percentage is " +  percentages[i] + 
                               " with grade " + grades[i]);
        }

        
    }
}












