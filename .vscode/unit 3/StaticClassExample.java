public class StaticClassExample {
    static class InnerClass {
        void display() {
            System.out.println("this is display method  inside InnerClass");
        }
    }

    public static void main(String args[]) {
        StaticClassExample.InnerClass obj = new StaticClassExample.InnerClass();
        obj.display();
    }
}
