package myapp;

import java.util.Scanner;

public class CheckOddEvenScanner {
    public static void main(String[] args) {
        System.out.println("Hello in the CheckOddEven program, please enter your number");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();

        if (number % 2 == 0 ) {
            System.out.println("Even number" + "\nBYE");
        }
        else {
            System.out.println("Odd number" + "\nBYE");
        }

    }
}
