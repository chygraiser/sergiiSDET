package myapp;

import java.util.Scanner;
import java.lang.Math;
public class СomparisonOfAbsoluteNumbers {
    public static void main(String[] args) {
        System.out.println("Hello in the Сomparison of absolute numbers program. \nPlease enter your first number");
        Scanner scan = new Scanner(System.in);
        double firstNumber, secondNumber;
        firstNumber = scan.nextDouble();
        System.out.println("Please enter your second number");
        secondNumber = scan.nextDouble();

        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            System.out.println("First number has bigger absolute number " + Math.abs(firstNumber));
        } else if (Math.abs(firstNumber) < Math.abs(secondNumber)) {
            System.out.println("Second number has bigger absolute number " + Math.abs(secondNumber));
        }
        else {
            System.out.println("Sorry, you have entered same numbers. \nPlease try again and enter different numbers");
        }

    }
}
