package lessons.summary3;

import java.util.Scanner;

public class WordConcat {
    public static String concatWord(String aStr, String bStr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first word");
        String firstString = scanner.nextLine();

        System.out.println("Input second word");
        String secondString = scanner.nextLine();

        scanner.close();
        return secondString;
    }
}
