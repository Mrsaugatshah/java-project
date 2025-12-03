import java.util.Scanner;

public class SumofDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, rem, sum = 0;
        System.out.print("enter the number");
        n = sc.nextInt();
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("\nsumof digits=" + sum);
    }
}
