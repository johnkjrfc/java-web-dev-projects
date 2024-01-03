package org.launchcode; //declares package where file resides.

import java.util.Scanner;  //grants access to the class, methods, and data stored in other files. java.util=package, Scanner= class name.

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;  //declare variable
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9; //init variable
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
