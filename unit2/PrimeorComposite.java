import java.util.Scanner;

public class PrimeorComposite {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, factor = 0, i;
        System.out.print("enter a number:");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                factor++;
        }
        if (factor == 0)
            System.out.println(n + "is prime number");
        else
            System.out.println(n + "is composite number");
    }

}
