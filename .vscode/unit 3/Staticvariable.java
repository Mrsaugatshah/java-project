public class Staticvariable {
    int rollno;
    String name;
    String subject = "oop in java";

    Staticvariable(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println("\nRollno =" + rollno);
        System.out.println("Name=" + name);
        System.out.println("subjectd =" + subject);
    }

    public static void main(String args[]) {
        Staticvariable obj1 = new Staticvariable(1, "Ramesh");
        Staticvariable obj2 = new Staticvariable(2, "Binod");
        obj1.display();
        obj2.display();
    }
}
