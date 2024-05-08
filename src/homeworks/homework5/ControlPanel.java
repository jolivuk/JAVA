package homeworks.homework5;

import java.util.Scanner;

public class ControlPanel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean game = true;
        int x = 0, y = 0;
        String command;

        while (game){
            command = scanner.nextLine();
            switch (command) {
                case "up" : x++; break;
                case "down": x--;break;
                case "right": y++;break;
                case "left": y--;break;
                case "loc":
                    System.out.println("[" + x + "," + y + "]");break;
                case "exit": game = false; break;
                default:
                    System.out.println("Wrong command. Accepted up down left right loc exit");
            }
        }
    }
}
