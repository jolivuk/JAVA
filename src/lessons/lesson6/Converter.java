package lessons.lesson6;

import java.util.Scanner;

public class Converter {
    public static double runCelsiusToKelvinConverter(double Temp){
        return Temp + 273.15;

    }
    public static double runCelsiusToFahrenheitConverter(double Temp) {
        return (Temp * (1.8)) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Temperature in Celsius");
        double Temp = scanner.nextDouble();
        System.out.println("Temperature in Kelvin is " + runCelsiusToKelvinConverter(Temp) + "K");
        System.out.println("Temperature in Fahrenheit is " + runCelsiusToFahrenheitConverter(Temp) + "\u00B0F");
    }
}
