import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
		//Create a program to find the bonus of employees based on their years of service.

		
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // bonus if years of service is greater than 5
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus.");
        }

       
    }
}



