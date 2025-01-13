import java.util.Scanner;

public class Day3Level2FriendCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // for storing ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];
        String name[] = {"Amar", "Akbar", "Anthony"}; // create string array so that we dont have to take input three different times

        // Input ages and heights 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + name[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + name[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        // Variables to find the youngestest and tallest
        int youngestest= 0;
        int tall= 0;

        // Loop through the arrays to find the youngestest and tallest among the friends
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) 
	    {youngest= i;
	    }
            
	    if (heights[i] > heights[tall]) {
                tall= i;
            }
        }

           // display the results at end
        System.out.println("The youngestest friend is " + name[youngest] + " with age " + ages[youngest]);
        System.out.println("The tallest friend is " + name[tall] + " with height " + heights[tall] + " cm");

        scanner.close();
    }
}