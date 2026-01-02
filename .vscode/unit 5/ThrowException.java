
import java.util.Scanner;

public class ThrowException {
    void validate(int age) {
        if (age < 16)
            throw new ArithmeticException("Not valid");
        else
            System.out.println("Could vote");
    }

    public static void main(String args[]) {
        ThrowException obj = new ThrowException();
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter age ");
        a = sc.nextInt();
        obj.validate(a);
    }
}
