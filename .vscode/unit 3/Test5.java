public class Test5 {
    void display() {
        this.show();
        System.out.println("Inside display fuction");
    }

    void show() {
        System.out.println("Inside show function");
    }

    public static void main(String args[]) {
        Test5 t1 = new Test5();
        t1.display();
    }
}
