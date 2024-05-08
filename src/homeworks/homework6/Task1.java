package homeworks.homework6;

import java.util.Arrays;

public class Task1 {
    /*
    Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.
     */
    public static void main(String[] args) {
        int min = 1, max = 50;
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min - 1);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
