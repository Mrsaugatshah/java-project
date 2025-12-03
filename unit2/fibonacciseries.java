import java.util.Scanner;

public class fibonacciseries {
    public static void main(String arg[]) {

        int n, i, a = 0, b = 1, c;
        double s = 0, avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print(a + "\t");
            s = s + a;
            c = a + b;
            a = b;
            b = c;
        }
        avg = s / n;
        System.out.println("\n" + "average of fibonacci series is" + avg);
    }
}
