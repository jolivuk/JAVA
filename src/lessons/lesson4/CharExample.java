package lessons.lesson4;
import java.util.Scanner;

public class CharExample {
    public static void main(String[] args) {
//     int num1 = 'A';
//     int num2 = Integer.valueOf('A');
//     int num3 = Character.getNumericValue('A');
//     char ch = 65;
//     System.out.println(num1);
//     System.out.println(num2);
//     System.out.println(num3);
//     System.out.println(ch);
//        int i = 127; // 127 byte
//        int i2 = 32000; //32000 - short
//        double d1 = 1; // 127 - int
//
//        int i3 = 130;
//        byte b = (byte)i3;
//        System.out.println(b);
//
//        int intNum = 10;
//        Integer intObj = intNum; // intObj = new Integer(intNum) boxing
//        Integer intObj2 = 123; // new Integer(123);
//        int intNum2 = intObj2; // unboxing

//        Распечатать последний символ строки. Используем метод String.charAt().
//                Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//                Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//                Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//                Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        Заменить все символы “а” на “о”. 
//        Преобразуйте строку к верхнему регистру.
//                Преобразуйте строку к нижнему регистру.

//        Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//        Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово из четного числа букв");
        String firstWord = scanner. nextLine();
        System.out.println(firstWord);
        System.out.println("Введите второе слово из четного числа букв");
        String secondWord = scanner. nextLine();
        System.out.println(secondWord);
        System.out.println(firstWord.substring(0,firstWord.length()/2) + secondWord.substring(secondWord.length()/2));
//        System.out.println(str.charAt(str.length()-1));
//        System.out.println(str.endsWith("!!!"));
//        System.out.println(str.startsWith("I like"));
//        System.out.println(str.contains("Java"));
//        System.out.println(str.indexOf("Java"));
//        System.out.println(str.replace('a','o'));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());

    }
}
