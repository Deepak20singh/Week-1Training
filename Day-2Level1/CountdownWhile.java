
import java.util.Scanner;

public class CountdownWhile {
	//countdown using while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Starting countdown value as input
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();

        // Printing the numbers from counter to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }
     
           }
}






