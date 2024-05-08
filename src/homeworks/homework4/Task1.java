package homeworks.homework4;

import java.awt.desktop.AboutEvent;

public class Task1 {

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        return isEdekaOpen || isReweOpen;
    }
    public static void main(String[] args) {
        /*1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых
        зависят от того, открыты магазины или нет.
                a. Реализует логический метод canBuy, возвращающий boolean
        b. Значение этой переменной должно быть true, если хотя бы один
        магазин открыт, иначе false.
                c. Отобразите строку «Я могу купить еду, это ……» и значение.*/

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        if (canBuy(isEdekaOpen,isReweOpen))
            System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen,isReweOpen));
        else System.out.println("Магазины закрыты");
    }
}
