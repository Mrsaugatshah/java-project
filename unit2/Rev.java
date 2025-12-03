import java.util.Scanner;

public class Rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, rem, reverse = 0;
        System.out.print("enter a number:");
        n = sc.nextInt();
        do {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;

        } while (n > 0);
        System.out.println("\nrevers of given number =" + reverse);
    }
}
