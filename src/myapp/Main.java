package myapp;

/*

1.Написати програму "CheckOddEven" яка друкує "Odd number", якщо змінна непарна, або "Even number", якщо парна.
  Перед завершенням роботи програма має друкувати "BYE".
  Значення змінної можна задати вручну через Scanner або присвоїти початкове значення в коді

2.Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC" якщо значення int змінної дорівнює 1, 2, 3 ... 12.
Або повинна вивести "Not a valid month". Розв'язати завдвння 2 способами:
1) за допомогою операторів if-else
2) за допомогою оператора switch
3.Написати програму, яка буде порівнювати абсолютні значення двох чисел.
Наприклад, для чисел 3 та -9 прогама повинна надрукувати, що -9 має більше абсолютне значення.
Для визначення абсолютного значення можна скористатися методом зі стандратної бібліотеки Math.abs()

4. Написати програму, яка визначає, чи є трикутник рівнобедреним.
Значення сторін трикутника задавати самостійно

5.Дано рядки різної довжини (довжина - парне число), необхідно повернути її два середні знаки.
Наприклад, якщо даний рядок "Hillel" результат буде "ll", для рядка "Java" результат "av", для "Hometask" результат "et".

*/

/* Task#1
import java.util.Scanner;

public class Main {
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
}*/

/* Task#1 V2
public class Main {
    public static void main(String[] args) {
        double number = 12;
        System.out.println("Hello in the CheckOddEven program,your number is " + number);

        if (number % 2 == 0) {
            System.out.println("It is Even number" + "\nBYE");
        } else {
            System.out.println("Odd number" + "\nBYE");
        }

    }
}*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in the PrintMonthInWord program, please enter number of the month:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month == 1) {
            System.out.println("Your month is January");
        } else if (month == 2) {
            System.out.println("Your month is February");
        } else if (month == 3) {
            System.out.println("Your month is March");
        } else if (month == 4) {
            System.out.println("Your month is April");
        } else if (month == 5) {
            System.out.println("Your month is May");
        } else if (month == 6) {
            System.out.println("Your month is June");
        } else if (month == 7) {
            System.out.println("Your month is July");
        } else if (month == 8) {
            System.out.println("Your month is August");
        } else if (month == 9) {
            System.out.println("Your month is September");
        } else if (month == 10) {
            System.out.println("Your month is October");
        } else if (month == 11) {
            System.out.println("Your month is November");
        } else if (month == 12) {
            System.out.println("Your month is December");
        }
        else {
            System.out.println("You entered invalid number of the month. Please try again.");
        }
    }
}