import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("enter two number");
        a = Sc.nextInt();
        b = Sc.nextInt();
        System.out.println("Before swapping a=" + a + "b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a=" + a + "b=" + b);
    }
}
