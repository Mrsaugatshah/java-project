import java.util.Scanner;

class c1 {
    protected int rollno;
    protected String name;
    protected String address;
    Scanner sc = new Scanner(System.in);

}

class c2 extends c1 {
    void getRollno() {
        System.out.println("rollno:");
        rollno = sc.nextInt();

    }

    void displayRollno() {
        System.out.println("\nRollno :" + rollno);
    }
}

class c3 extends c1 {
    void getName() {
        System.out.println("Name:");
        name = sc.next();
    }

    void displayName() {
        System.out.println("\nName:" + name);
    }
}

class c4 extends c1 {
    void getAddress() {
        System.out.println("Address:");
        address = sc.next();
    }

    void displayAddress() {
        System.out.println("\nAddress:" + address);
    }
}

public class HierarchhicalInheritance {
    public static void main(String args[]) {
        c2 obj1 = new c2();
        c3 obj2 = new c3();
        c4 obj3 = new c4();
        obj1.getRollno();
        obj2.getName();
        obj3.getAddress();
        obj1.displayRollno();
        obj2.displayName();
        obj3.displayAddress();
    }

}
