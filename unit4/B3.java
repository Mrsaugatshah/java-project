
//multilevel exaple
import java.util.Scanner;

class B1 {
    protected int rollno;
    protected String name;
    protected String address;
    Scanner sc = new Scanner(System.in);
}

class B2 extends B1 {
    protected void get() {
        System.out.println("rollno:");
        rollno = sc.nextInt();
        System.out.println("name:");
        name = sc.next();
        System.out.println("address:");
        address = sc.next();

    }
}

public class B3 extends B2 {
    void display() {
        System.out.println("\nrollno:" + rollno);
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
    }

    public static void main(String args[]) {
        B3 obj = new B3();
        obj.get();
        obj.display();
    }
}
