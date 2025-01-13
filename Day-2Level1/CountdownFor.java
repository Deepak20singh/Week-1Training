import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Starting countdown value as input
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();

        // Use a for loop to print numbers from counter to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
            }
}




