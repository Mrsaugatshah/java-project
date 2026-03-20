//using this keyword as method parameter
public class Test4 {
    int a;
    int b;

    Test4() {
        a = 10;
        b = 20;
    }

    void display(Test4 obj) {
        System.out.println("a=" + obj.a + "b=" + obj.b);

    }

    void get() {
        display(this);
    }

    public static void main(String[] args) {
        Test4 object = new Test4();
        object.get();
    }
}
