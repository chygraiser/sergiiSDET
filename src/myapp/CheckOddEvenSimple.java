package myapp;

public class CheckOddEvenSimple {
    public static void main(String[] args) {
        double number = 12;
        System.out.println("Hello in the CheckOddEven program,your number is " + number);

        if (number % 2 == 0) {
            System.out.println("It is Even number" + "\nBYE");
        } else {
            System.out.println("Odd number" + "\nBYE");
        }

    }
}
