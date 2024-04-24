package lessons.lesson6;

public class ByteError {
    public static void main(String[] args) {
        byte a = 127;
        byte b = 1;
        byte c = (byte) (a + b);
        System.out.println("Result of (127 + 1) as byte: " + c);
    }
}
