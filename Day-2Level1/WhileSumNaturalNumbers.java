import java.util.*;

public class WhileSumNaturalNumbers {
    public static void main(String[] args) {
		//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("The number is not a natural number.");
        } else {
           
            // sum using while loop
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

                        System.out.println("Sum using while loop: " + sum);
                   }

           }
}

