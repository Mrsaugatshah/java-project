public class Test1 {

    int a, b;

    Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a=" + a + "b=" + b);
    }

    public static void main(String args[]) {
        Test1 obj = new Test1(10, 20);
        obj.display();
    }
}
