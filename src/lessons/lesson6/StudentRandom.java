package lessons.lesson6;

import java.util.Scanner;

public class StudentRandom {

    public static int whoWillgiveAnswer(int num){
        return (int)(Math.random() * (num + 2)+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student number");
        int numStudents = scanner.nextInt();
        System.out.println("Student number " + whoWillgiveAnswer(numStudents) + " will answer");
    }
}
