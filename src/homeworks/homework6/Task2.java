package homeworks.homework6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int min = 10, max = 99;
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min - 1);
        }
        System.out.println(Arrays.toString(arr));

        boolean flagIncrease = true;
        for (int i = 0; (i < arr.length - 1)&& flagIncrease; i+=2) {
            if (arr[i+1]<arr[i]) {
                flagIncrease = false;
            }
        }
        if (flagIncrease)
            System.out.println("Massive is sorted");
        else System.out.println("Massive is not sorted");

        Arrays.sort(arr);


        flagIncrease = true;
        for (int i = 0; (i < arr.length - 1)&& flagIncrease; i+=2) {
            if (arr[i+1]<=arr[i]) {
                flagIncrease = false;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (flagIncrease)
            System.out.println("Massive is sorted");
        else System.out.println("Massive is not sorted");


    }
}
