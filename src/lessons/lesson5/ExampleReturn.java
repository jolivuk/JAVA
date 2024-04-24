package lessons.lesson5;

public class ExampleReturn {
    public static void main(String[] args) {
        print(10);
        System.out.println(10);
        System.out.println();
    }

    public static void print(int number){
        System.out.println(number);
    }
    public static int square(int number) {
        return number*number;
    }

    public static int exceptionOnZero(int number) throws Exception{
        if (number == 0) {
            throw new Exception("Zero");
        }
        return number;
    }
}
