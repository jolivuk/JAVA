package lessons.lesson3;

import java.util.Scanner;
import java.lang.Math;

public class ScannerTest {
    public static void main(String[] args) {

//        System.out.println("Введите стоку");
//        String s = scanner. nextLine();
//        System.out.println(s);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println(i);
//        System.out.println("Введите true или false");
//        boolean b = scanner.nextBoolean();
//        System.out.println(b);
//        System.out.println("Введите длинное число");
//        long l = scanner.nextLong();
//        System.out.println(l);
//        System.out.println("Введите дробное число");
//        double d = scanner.nextDouble();
//        System.out.println(d);

//        Создать объект Scanner
//        Получить от пользователя первое число
//        Получить от пользователя второе число
//        Произвести математические операции +, -, *, /
//        Вывести результат в консоль
//        System.out.println("Введите первое число");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Введите второе число");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Введите математическую операцию +, -, *, /");
//        char operation = scanner.next().charAt(0);
//        if (operation == '+') {
//            System.out.println( firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
//        } else if (operation == '-') {
//            System.out.println( firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
//        } else if (operation == '*') {
//            System.out.println( firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
//        } else if (operation == '/') {
//            System.out.println( firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
//        }
//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        int radius = scanner.nextInt();
        System.out.println( " Площадь круга  " + ( Math.PI * radius * radius));
//        System.out.println("Hello world!");
//        Scanner sc = new Scanner(System.in);

    }
}
