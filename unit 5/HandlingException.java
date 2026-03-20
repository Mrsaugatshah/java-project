import java.util.Scanner;

public class HandlingException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("We shouldnot divide a number by Zero");

        }
    }
}
