class Rectangle {
    int length, breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to return area
    int Area() {
        return length * breadth;
    }
}

public class qestionno16 {
    public static void main(String[] args) {

        // First rectangle
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println("Area of Rectangle 1: " + r1.Area());

        // Second rectangle
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}
