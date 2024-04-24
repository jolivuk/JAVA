package lessons.lesson5;

import java.util.Random;

public class RandomExample {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int upperBound = 16;
//        int lowerBound = 5;
//        System.out.println(random.nextInt(lowerBound, upperBound));
//
//        double randomDouble = random.nextDouble(); // от 0.0 включительно до 1.0 НЕ включительно
//        System.out.println(randomDouble);
//
//        byte tempToday = getWeather();
//        byte tempTomorrow = getWeather();
//        byte tempAfterTomorrow = getWeather();
//        if (tempToday>0) {
//            System.out.println("Температура воздуха сегодня +" + tempToday + "\u00B0C");
//        }
//        else {
//            System.out.println("Температура воздуха сегодня " + tempToday + "\u00B0C");
//        }
//        if (tempTomorrow>0) {
//            System.out.println("Температура воздуха завтра +" + tempTomorrow + "\u00B0C");
//        }
//        else {
//            System.out.println("Температура воздуха завтра " + tempTomorrow + "\u00B0C");
//        }
//        if (tempAfterTomorrow>0) {
//            System.out.println("Температура воздуха послезавтра +" + tempAfterTomorrow + "\u00B0C");
//        }
//        else {
//            System.out.println("Температура воздуха послезавтра " + tempAfterTomorrow + "\u00B0C");
//        }
//
//    }
//    public static byte getWeather(){
////        Random rand = new Random();
////        return (byte) rand.nextInt(1,7);
//        int min = -21;
//        int max = 31;
//
//        int range = (max - min) + 1;
//        int random = (int) ((range * Math.random()) + min);
//        return (byte)random;
//
//    }

    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int randomNum = (int)(Math.random() * (max - min + 1) + min); // число [0.0; 1.0)
        System.out.println("Случайное число от " + min + " до " + max + ": " + randomNum);

        printWeatherForecast();
    }

    public static void printWeatherForecast() {
        System.out.println("Сегодня: " + generateTemperature());
        System.out.println("Завтра: " + generateTemperature());
        System.out.println("Послезавтра: " + generateTemperature());

            System.out.println("Послезавтра2: " + generateTemperature(-45,50));

    }

    public static int getTodayWeather() {
        return generateTemperature();
    }

    public static int generateTemperature() {
        int minTemp = -21, maxTemp = 31;
        return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp);
    }

    public static int generateTemperature(int minTemp, int maxTemp) {
//            int minTemp_ = , maxTemp = 31;
            return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp - 1);
        }

}
