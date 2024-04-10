package Lessons.lesson3;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоку");
        String s = scanner. nextLine();
        System.out.println(s);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println("Введите true или false");
        boolean b = scanner.nextBoolean();
        System.out.println(b);
        System.out.println("Введите длинное число");
        long l = scanner.nextLong();
        System.out.println(l);
        System.out.println("Введите дробное число");
        double d = scanner.nextDouble();
        System.out.println(d);





    }
}
