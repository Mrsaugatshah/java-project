import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        java.util.Scanner Sc = new Scanner(System.in);
        int p;
        double t, r, si;
        System.out.print("Enter principle,time  and rate:");
        p = Sc.nextInt();
        t = Sc.nextDouble();
        r = Sc.nextDouble();
        si = (p * t * r) / 100;
        System.out.println("Simple interest=" + si);

    }
}
