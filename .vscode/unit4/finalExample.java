
final class Final {
    final int a = 5;

    final void display() {
        System.out.println("this is final method inside final class");
    }
}

public class finalExample {
    public static void main(String args[]) {
        Final obj = new Final();
        obj.display();
    }

}