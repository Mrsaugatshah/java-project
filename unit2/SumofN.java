import java.util.Scanner;

public class SumofN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, i, sum = 0;
        System.out.print("enter the value of N:");
        N = sc.nextInt();
        for (i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("sum fo first n natural number=" + sum);
    }

}
