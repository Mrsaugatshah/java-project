import java.util.Scanner;

public class OddNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, sum = 0;
        System.out.println("enter the no of array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("enter the element arr[" + i + "]:");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0)
                sum = sum + arr[i];
        }
        System.out.println("\nsum of odd number in array=" + sum);
    }

}
