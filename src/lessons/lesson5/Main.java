package lessons.lesson5;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.say();
//        System.out.println("Get say: " + dog.getSay());
    int a = 5;
    int b = 4;
    System.out.println(a + " + " + b + " = " + getReturnSum(a,b));
    getSum(a,b);

    }
    public static void getSum(int a, int b){
        System.out.println(a + b);

    }
    public static int getReturnSum(int a, int b){
        return (a + b);
    }
}
