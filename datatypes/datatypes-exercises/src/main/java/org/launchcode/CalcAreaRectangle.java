package org.launchcode;
import java.util.Scanner;
public class CalcAreaRectangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Hello, what is the width your rectangle:");
        double width = input.nextDouble();
        System.out.println("What is the height of your rectangle:");
        double height = input.nextDouble();
        double area = height * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
