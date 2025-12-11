class outer {
    int x = 5;

    private class Inner {
        void display() {
            System.out.println("value of x=" + x);
        }

    }

    void show() {
        Inner obj = new Inner();
        obj.display();

    }

}

public class Innerclass {
    public static void main(String args[]) {
        outer ob = new outer();

        ob.show();

    }
}
