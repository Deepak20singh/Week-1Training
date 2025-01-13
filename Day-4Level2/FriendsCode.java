import java.util.Scanner;

public class FriendsCode {

    // Method to find the youngest friend based on age
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";
        
        // Compare ages to find the minimum (youngest)
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                if (i == 1) youngest = "Akbar"; // Akbar is second friend
                else if (i == 2) youngest = "Anthony"; // Anthony is third friend
            }
        }
        return youngest;
    }

    // Method to find the tallest friend based on height
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar";
        
        // Compare heights to find the maximum (tallest)
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                if (i == 1) tallest = "Akbar"; // Akbar is second friend
                else if (i == 2) tallest = "Anthony"; // Anthony is third friend
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Take user input for the ages and heights of the 3 friends
        System.out.println("Enter the age and height for Amar, Akbar, and Anthony:");

        // Input for ages
        System.out.print("Amar's age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Akbar's age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Anthony's age: ");
        ages[2] = scanner.nextInt();

        // Input for heights
        System.out.print("Amar's height (in cm): ");
        heights[0] = scanner.nextDouble();
        System.out.print("Akbar's height (in cm): ");
        heights[1] = scanner.nextDouble();
        System.out.print("Anthony's height (in cm): ");
        heights[2] = scanner.nextDouble();

        // Find the youngest and the tallest friend
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}









   


















