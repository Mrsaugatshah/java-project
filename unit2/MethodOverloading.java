import java.util.Scanner;

public class MethodOverloading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, radius;
        System.out.print("enter the length and breadth of rectangle:");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.print("enter radius of circle:");
        radius = sc.nextInt();
        MethodOverloading obj = new MethodOverloading();
        obj.area(length, breadth);
        obj.area(radius);

    }

    void area(int l, int b) {
        System.out.println("area of rectangle=" + (l * b));
    }

    void area(int r) {
        System.out.println("area of circle=" + (3.14 * r * r));
    }
}
