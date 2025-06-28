import java.util.Scanner;

    

public class Temperature
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Conversion Program");
        System.out.println("-------------------------------");
        
        // Get temperature value from user
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        // Get temperature unit from user
        System.out.print("Enter temperature unit (C, F, or K): ");
        String unit = scanner.next().toUpperCase();
        
        double celsius, fahrenheit, kelvin;
        
        // Convert based on input unit
        switch(unit) {
            case "C":
                celsius = temperature;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = (fahrenheit - 32) * 5/9 + 273.15;
                break;
            case "K":
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (kelvin - 273.15) * 9/5 + 32;
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                return;
        }
        
        // Display results
        System.out.println("\nConversion Results:");
        System.out.println("------------------");
        System.out.printf("%s %.2f°\n", "Original temperature:", temperature);
        System.out.printf("%s %.2f°C\n", "Celsius:", celsius);
        System.out.printf("%s %.2f°F\n", "Fahrenheit:", fahrenheit);
        System.out.printf("%s %.2fK\n", "Kelvin:", kelvin);
        
        scanner.close();
    }
}


    

