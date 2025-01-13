import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input from user

        System.out.print("Enter side1 of the park in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 of the park in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 of the park in meters: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;  // Perimeter of the park in meters
        double totalDistanceInMeters = 5000;      // 5 km = 5000 meters
        int rounds = (int)Math.ceil(totalDistanceInMeters / perimeter); // For Calculating rounds

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

           }
}

