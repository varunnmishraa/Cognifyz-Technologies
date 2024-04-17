import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double temperature;
        int conversionDirection;
        
        // Step 1: Design a program to accept temperature input
        System.out.print("Enter the temperature value: ");
        temperature = scanner.nextDouble();
        
        // Step 2: Allow users to choose the conversion direction
        System.out.println("Choose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        conversionDirection = scanner.nextInt();
        
        // Step 3: Implement logic for temperature conversion
        double convertedTemperature;
        if (conversionDirection == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
        } else if (conversionDirection == 2) {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        
        // Step 4: Test the program with different input values.
    }
}