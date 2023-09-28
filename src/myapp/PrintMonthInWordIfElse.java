package myapp;

import java.util.Scanner;
public class PrintMonthInWordIfElse {
    public static void main(String[] args) {
        System.out.println("Hello in the PrintMonthInWord program, please enter month number from 1 to 12:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month == 1) {
            System.out.println("Your month is January. \nThank You.");
        } else if (month == 2) {
            System.out.println("Your month is February. \nThank You.");
        } else if (month == 3) {
            System.out.println("Your month is March. \nThank You.");
        } else if (month == 4) {
            System.out.println("Your month is April. \nThank You.");
        } else if (month == 5) {
            System.out.println("Your month is May. \nThank You.");
        } else if (month == 6) {
            System.out.println("Your month is June. \nThank You.");
        } else if (month == 7) {
            System.out.println("Your month is July. \nThank You.");
        } else if (month == 8) {
            System.out.println("Your month is August. \nThank You.");
        } else if (month == 9) {
            System.out.println("Your month is September. \nThank You.");
        } else if (month == 10) {
            System.out.println("Your month is October. \nThank You.");
        } else if (month == 11) {
            System.out.println("Your month is November. \nThank You.");
        } else if (month == 12) {
            System.out.println("Your month is December. \nThank You.");
        }
        else {
            System.out.println("Sorry, you have entered an invalid month number. \nPlease try again and enter number from 1 to 12.");
        }
    }
}
