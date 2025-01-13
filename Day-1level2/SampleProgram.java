import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter To City: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter distance from From City to Via City in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance from Via City to To City in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println(name + " traveled from " + fromCity + " to " + toCity + " via " + viaCity +
                           " covering a total distance of " + totalDistance + " miles.");

           }
}


