package myapp;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Hello in the Isosceles triangle program. \nPlease enter your first side of triangle");
        Scanner scan = new Scanner(System.in);
        double firstside, secondside;
        firstside = scan.nextDouble();
        System.out.println("Please enter your side of triangle");
        secondside = scan.nextDouble();

        if (firstside == secondside) {
            System.out.println("Congratulation your triangle is isosceles. \nThank You.");
        } else {
            System.out.println("Sorry, your triangle is not isosceles. \nPlease try again.");
        }
    }
}
