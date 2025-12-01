import java.util.Scanner;

public class Sphere {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("enter radious of circle:");
        r = sc.nextInt();
        System.out.println("area of sphere=" + 4 * 3.14 * r * r);
        System.out.println("volume of sphere=" + 4 / 3.0 * 3.14 * r * r * r);
    }
}
