import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.println("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);

        double celsius, fahrenheit, kelvin;

        switch(unit) {

            case 'C':
                celsius = temp;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                System.out.println("Fahrenheit: " + fahrenheit);
                System.out.println("Kelvin: " + kelvin);
                break;

            case 'F':
                fahrenheit = temp;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                System.out.println("Celsius: " + celsius);
                System.out.println("Kelvin: " + kelvin);
                break;

            case 'K':
                kelvin = temp;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Celsius: " + celsius);
                System.out.println("Fahrenheit: " + fahrenheit);
                break;

            default:
                System.out.println("Invalid Unit Entered!");
        }

        sc.close();
    }
}