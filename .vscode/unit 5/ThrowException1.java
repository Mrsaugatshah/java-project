import java.util.Scanner;

public class ThrowException1 {
    void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        System.out.println("result:" + (a / b));
    }

    public static void main(String[] args) {
        ThrowException1 obj1 = new ThrowException1();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("enter two number");
        int a = obj2.nextInt();
        int b = obj2.nextInt();
        try {
            obj1.divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("exception caught");
        }
    }
}
