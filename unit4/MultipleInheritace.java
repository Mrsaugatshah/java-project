import java.util.Scanner;

interface circle {
    void area(int r);
}

interface Rectangle {
    void area(int l, int b);
}

public class MultipleInheritace implements circle, Rectangle {
    @Override
    public void area(int r) {
        System.out.println("Area of Circle=" + 3.14 * r * r);
    }

    @Override
    public void area(int l, int b) {
        System.out.println("area of Rectangle=" + (l * b));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radious, length, breadth;
        MultipleInheritace obj = new MultipleInheritace();
        System.out.println("Enter radius of circle: ");
        radious = sc.nextInt();
        System.out.println("enter lenght and breadth of Rectangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        obj.area(radious);
        obj.area(length, breadth);
    }
}
