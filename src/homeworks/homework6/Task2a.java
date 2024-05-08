package homeworks.homework6;

import java.util.Arrays;

public class Task2a {

    public static int findMissingNumber(int[] arr){
        boolean flagFound;
        int missingNumber = 0;
        for (int i = 1; i <= arr.length; i++) {
            flagFound = false;
            int j = 0;
            while(!flagFound && (j < arr.length)){
                if (arr[j] == i) { flagFound = true;
                }
                j++;
            }
            if (!flagFound) {
                missingNumber = i;
                break;
            }

        }
        return missingNumber;
    }
    public static void main(String[] args) {
        int N = 5;
        int[] arr1 = {1,3,2,5};
        System.out.println(Arrays.toString(arr1));
        System.out.println("Missing Number is " + findMissingNumber(arr1));

        N = 10;
        int[] arr2 = {6,1,2,8,3,4,7,10,5};
        System.out.println(Arrays.toString(arr2));
        System.out.println("Missing Number is " + findMissingNumber(arr2));

    }
}
