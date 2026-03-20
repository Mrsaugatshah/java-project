import java.util.Scanner;

class fibonacci {
    int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return (fibo(n - 1) + fibo(n - 2));
    }
}

public class RecursionExample2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, i;
        System.out.print("no of terms:");
        N = sc.nextInt();
        fibonacci obj = new fibonacci();
        for (i = 0; i < N; i++) {
            System.out.print(obj.fibo(i) + " ");
        }
    }

}
