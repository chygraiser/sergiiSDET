package myapp;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Hello in the Isosceles triangle program. \nPlease enter your first side of triangle");
        Scanner scan = new Scanner(System.in);
        double firstSide, secondSide, thirdSide;
        firstSide = scan.nextDouble();
        System.out.println("Please enter your second side of triangle");
        secondSide = scan.nextDouble();
        System.out.println("Please enter your third side of triangle");
        thirdSide = scan.nextDouble();

        if (firstSide == secondSide && firstSide != thirdSide && firstSide != 0 && thirdSide != 0) {
            System.out.println("Congratulation your first and second sides are equal! \nYour triangle is isosceles. \nThank You.");
        } else if (firstSide == thirdSide && firstSide != secondSide && firstSide != 0 && secondSide != 0) {
            System.out.println("Congratulation your first and third sides are equal! \nYour triangle is isosceles. \nThank You.");
        } else if (secondSide == thirdSide && secondSide != firstSide && secondSide != 0 && firstSide != 0) {
            System.out.println("Congratulation your second and third sides are equal! \nYour triangle is isosceles. \nThank You.");
        } else
        {
            System.out.println("Sorry, your triangle is not isosceles. \nPlease try again.");
        }
    }
}
