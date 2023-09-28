package myapp;

import java.util.Scanner;
import java.lang.Math;
public class СomparisonOfAbsoluteNumbers {
    public static void main(String[] args) {
        System.out.println("Hello in the Сomparison of absolute numbers program. \nPlease enter your first number");
        Scanner scan = new Scanner(System.in);
        double firstnumber, secondnumber;
        firstnumber = scan.nextDouble();
        System.out.println("Please enter your second number");
        secondnumber = scan.nextDouble();

        if (Math.abs(firstnumber) > Math.abs(secondnumber)) {
            System.out.println("First number has bigger absolute number " + Math.abs(firstnumber));
        } else if (Math.abs(firstnumber) < Math.abs(secondnumber)) {
            System.out.println("Second number has bigger absolute number " + Math.abs(secondnumber));
        }
        else {
            System.out.println("Sorry, you have entered same numbers. \nPlease try again and enter different numbers");
        }

    }
}
