
class Triangle {
    int a, b, c;

    // Constructor with three parameters
    Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Method to calculate and print perimeter
    void perimeter() {
        int p = a + b + c;
        System.out.println("Perimeter of triangle = " + p);
    }

    // Method to calculate and print area
    void area() {
        double s = (a + b + c) / 2.0; // semi-perimeter
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle = " + ar);
    }
}

public class TriangleDemo {
    public static void main(String args[]) {
        Triangle t = new Triangle(3, 4, 5);
        t.perimeter();
        t.area();
    }
}
