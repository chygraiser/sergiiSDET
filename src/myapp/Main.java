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
}
