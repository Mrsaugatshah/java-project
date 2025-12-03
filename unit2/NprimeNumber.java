import java.util.Scanner;

public class NprimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, count = 0, factor = 0, i, n;
        System.out.print("enter the value of n:");
        N = sc.nextInt();
        for (n = 1; count != n; n++) {
            for (i = 1; i < n; i++) {
                if (n % i == 0)
                    factor++;
            }

            if (factor == 2) {
                count++;
                System.out.println(n);
            }
            factor = 0;
        }
    }

}
