public class Test2 {
    int a;
    int b;

    Test2() {
        this(10, 20);
        System.out.println("Inside defult constructor\n");
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a=" + a + "b=" + b);

    }

    public static void main(String[] args) {
        Test2 object = new Test2();
    }

}
