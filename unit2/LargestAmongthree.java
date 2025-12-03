import java.util.Scanner;

public class LargestAmongthree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("number are equal");
        else if (a > b) {
            if (a > c)
                System.out.println(a + "is largest");
            else
                System.out.println(a + "is largest");
        } else {
            if (b > c)
                System.out.println(b + "is largest");
            else
                System.out.println(c + "is largest");
        }
    }
}
