package HW.homework3;

import java.util.Scanner;

public class homework3 {
    public static int calcSum(int a, int b) {
        return a+b;
    }

    public static int calcDiff(int a, int b) {
        return a-b;
    }
    public static int calcMult(int a, int b) {
        return a*b;
    }
    public static double calcDiv(int a, int b) {
        return (double) a / b;
    }



    public static void main(String[] args) {
        //  1. Условие здачи: ввести 2 слова, состоящие из четного числа букв.
        //  Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово из четного числа букв");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово из четного числа букв");
        String secondWord = scanner.nextLine();
        System.out.println(firstWord.substring(0,firstWord.length()/2) + secondWord.substring(secondWord.length()/2));


        //Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».
        //«Ваше имя начинается с символа <.> и заканчивается на символ <.>».
        System.out.println("Введите свое имя");
        //String myname = scanner.nextLine();
        String myname = scanner.nextLine();
        System.out.println("Добрый день,"+ myname + " !");
        System.out.println("Ваше имя начинается на \""+ myname.charAt(0) + "\" и заканчивается на \"" + myname.charAt(myname.length()-1) + "\"");


        //2. Создайте методы с математическими операциями +, -, *, /
        //Каждый метод принимает два числа в параметрах и возвращает результат
        //Вызовите все методы в main
        //Результат распечатайте в консоль
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите математическую операцию +, -, *, /");
        char operation = scanner.next().charAt(0);
        if (operation == '+') {
            System.out.println( firstNumber + " + " + secondNumber + " = " + calcSum(firstNumber,secondNumber));
        } else if (operation == '-') {
            System.out.println( firstNumber + " - " + secondNumber + " = " + calcDiff(firstNumber,secondNumber));
        } else if (operation == '*') {
            System.out.println( firstNumber + " * " + secondNumber + " = " + calcMult(firstNumber,secondNumber));
        } else if (operation == '/') {
            System.out.println( firstNumber + " / " + secondNumber + " = " + calcDiv(firstNumber,secondNumber));
        }


//        System.out.println("Введите свое имя");
//        String myname = scanner.nextLine();
//        System.out.println("Добрый день,"+ myname + " !");
//        System.out.println("Ваше имя начинается на "+ myname.charAt(0) + " и заканчивается на" + myname.charAt(myname.length()-1));


    }
}
