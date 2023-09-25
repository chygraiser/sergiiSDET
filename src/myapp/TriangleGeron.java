package myapp;

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1 - Done");
    }
}
*/

/*
Формули
Celsius = 5/9 (F - 32)
Kelvin = C + 273.16
Вивід має бути приблизно таким: "X Celsius: Y Fahrenheit; Z Kelvin",
де X - початкове значення в градусах Цельсія,
Y и Z - обчислені значення в Фаренгейтах и Кельвінах відповідно.

double Kelvin = (Celsius + 273.16);
*/

/*
public class Temperature
{
    public static void main(String[] args)
    { double Celsius, Fahrenheit, Kelvin;
        Celsius= 34;
        Fahrenheit =((Celsius*9)/5)+32;
        Kelvin =(Celsius + 273.16);
        System.out.print(Celsius);
        System.out.print("С(Celsius):");
        System.out.print(Fahrenheit);
        System.out.print("F(Fahrenheit);");
        System.out.print(Kelvin);
        System.out.print("K(Kelvin);");
    }
}
*/

/*
Написати програму, яка обчислює площу прямокутного трикутника,
початкові значення сторін можна задати довільно.
*/

/*
import java.util.Scanner;

public class Triangle
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        double a,b,S;
        System.out.println("Введіть довжину першого катета a: ");
        a =scan.nextDouble();
        System.out.println("Введіть довжину другого катета b: ");
        b = scan.nextDouble();
        S=a*b/2;
        System.out.println("Полоща прямокутного трикутника S="+S);

    }
}
*/

import java.util.Scanner;

public class TriangleGeron {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,p,s;
        System.out.println("Введіть довжину першого катета a: ");
        a = input.nextDouble();
        System.out.println("Введіть довжину другого катета b: ");
        b = input.nextDouble();
        System.out.println("Введіть довжину гіпотенузи c: ");
        c = input.nextDouble();
        p = (a + b + c) / 2;
        System.out.println("Полупериметр прямокутного трикутника P="+p);
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Полоща прямокутного трикутника за формулою Герона S="+s);
        System.out.print("Запищіть відповіть та дякуємо що скористались нашою програмою.Ви отримали купон -100 гривень на наступну покупку");

    }
}