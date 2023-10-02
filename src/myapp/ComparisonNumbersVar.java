package myapp;

import java.util.Scanner;
import java.lang.Math;

public class ComparisonNumbersVar {
        public static void main(String[] args) {
            System.out.println("Hello in the Сomparison of absolute numbers program. \nPlease enter your first number");
            Scanner scan = new Scanner(System.in);
            double firstNumber, secondNumber;
            firstNumber = scan.nextDouble();
            System.out.println("Please enter your second number");
            secondNumber = scan.nextDouble();
            double one = Math.abs(firstNumber), two = Math.abs(secondNumber);

            if (one > two) {
                System.out.println("First number has bigger absolute number " + one);
            } else if (one < two) {
                System.out.println("Second number has bigger absolute number " + two);
            }
            else {
                System.out.println("Sorry, you have entered same numbers. \nPlease try again and enter different numbers");
            }

        }
    }

