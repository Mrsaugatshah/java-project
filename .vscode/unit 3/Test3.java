public class Test3 {
    int a;
    int b;

    Test3() {
        a = 10;
        b = 20;
    }

    Test3 get() {
        return this;
    }

    void display() {
        System.out.println("a=" + a + "b=" + b);
    }

    public static void main(String args[]) {

        Test3 object = new Test3();
        object.get().display();
    }

}
