package homeworks.homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Реализуйте программу, которая попросит пользователя ввести три целых
числа (используйте сканер) и напечатает максимум из трех чисел.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int max = number1 > number2 ? number1 : number2;
        max = number3 > max ? number3 : max;

        System.out.println("Max number is " + max);
    }

}
