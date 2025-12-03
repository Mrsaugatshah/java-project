import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("enter a number");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}
