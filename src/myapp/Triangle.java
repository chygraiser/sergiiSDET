package myapp;

import java.util.Scanner;

public class Triangle {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,s;
        System.out.println("Введіть довжину першого катета a: ");
        a = scan.nextDouble();
        System.out.println("Введіть довжину другого катета b: ");
        b = scan.nextDouble();
        s = a * b / 2;
        System.out.println("Полоща прямокутного трикутника S=" + s);

    }
}