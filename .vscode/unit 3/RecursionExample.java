import java.util.Scanner;

class factorial {
    int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));

    }
}

public class RecursionExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("enter a number:");
        num = sc.nextInt();
        factorial obj = new factorial();
        System.out.println("factorial of" + num + "=" + obj.fact(num));
    }

}
