package unit2;

import java.util.Scanner;

public class NprimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (number of primes to print): ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            sc.close();
            return;
        }
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("N must be a positive integer.");
            sc.close();
            return;
        }

        int count = 0;
        int num = 2; // first candidate
        while (count < N) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        sc.close();
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
