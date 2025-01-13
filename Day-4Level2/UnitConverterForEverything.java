import java.util.*;
public class UnitConverterForEverything {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Test the conversion methods

        // Convert Fahrenheit to Celsius
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        // Convert Celsius to Fahrenheit
        double celsiusValue = 37;
        double fahrenheitValue = convertCelsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + "°C = " + fahrenheitValue + "°F");

        // Convert Pounds to Kilograms
        double pounds = 150;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " lbs = " + kilograms + " kg");

        // Convert Kilograms to Pounds
        double kilogramsValue = 68;
        double poundsValue = convertKilogramsToPounds(kilogramsValue);
        System.out.println(kilogramsValue + " kg = " + poundsValue + " lbs");

        // Convert Gallons to Liters
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons = " + liters + " liters");

        // Convert Liters to Gallons
        double litersValue = 20;
        double gallonsValue = convertLitersToGallons(litersValue);
        System.out.println(litersValue + " liters = " + gallonsValue + " gallons");
    }
}







   


















