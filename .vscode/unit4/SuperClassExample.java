//super to invoke parent class constructor

class superclass {
    superclass(int a) {
        System.out.println("value of a=" + a);
    }
}

public class SuperClassExample extends superclass {
    SuperClassExample(int x, int y) {
        super(x);
        System.out.println("value of x=" + x + "y=" + y);
    }

    public static void main(String args[]) {
        SuperClassExample obj = new SuperClassExample(5, 10);
    }
}
