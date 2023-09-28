package myapp;

import java.util.Scanner;
public class PrintMonthInWordSwitch {
    public static void main(String[] args) {
        System.out.println("Hello in the PrintMonthInWord program, please enter month number from 1 to 12:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month) {
            case 1:
                System.out.println("Your month is January. \nThank You.");
                break;
            case 2:
                System.out.println("Your month is February. \nThank You.");
                break;
            case 3:
                System.out.println("Your month is March. \nThank You.");
                break;
            case 4:
                System.out.println("Your month is April. \nThank You.");
                break;
            case 5:
                System.out.println("Your month is May. \nThank You.");
                break;
            case 6:
                System.out.println("Your month is June. \nThank You.");
                break;
            case 7:
                System.out.println("Your month is July. \nThank You.");
                break;
            case 8:
                System.out.println("Your month is August. \nThank You.");
                break;
            case 9:
                System.out.println("Your month is September. \nThank You.");
                break;
            case 10:
                System.out.println("Your month is October. \nThank You.");
                break;
            case 11:
                System.out.println("Your month is November. \nThank You.");
                break;
            case 12:
                System.out.println("Your month is December. \nThank You.");
                break;
            default:
                System.out.println("Sorry, you have entered an invalid month number. \nPlease try again and enter number from 1 to 12.");
                break;
        }
    }
}
