class Rectangle {
    int length;
    int breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to print area
    void printArea() {
        System.out.println("Area = " + (length * breadth));
    }

    // Method to print perimeter
    void printPerimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}

// Square class inheriting Rectangle
class Square extends Rectangle {

    // Constructor
    Square(int s) {
        super(s, s); // calling parent constructor
    }
}

// Main class
public class qno22 {
    public static void main(String[] args) {

        // Rectangle object
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle:");
        r.printArea();
        r.printPerimeter();

        System.out.println();

        // Square object
        Square s = new Square(4);
        System.out.println("Square:");
        s.printArea();
        s.printPerimeter();
    }
}
