
//single level inheritance
import java.util.Scanner;

class A1 {
    protected int rollno;
    protected String name;
    protected String address;

    protected void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("rollon:");
        rollno = sc.nextInt();
        System.out.print("name:");
        name = sc.next();
        System.out.print("Address:");
        address = sc.next();
    }
}

public class A2 extends A1 {
    void display() {
        System.out.println("\nRollno:" + rollno);
        System.out.println("name:" + name);
        System.out.println("Adress:" + address);
    }

    public static void main(String args[]) {
        A2 obj = new A2();
        obj.get();
        obj.display();
    }
}
