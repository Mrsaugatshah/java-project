public class Staticmethod {
    static int rollno;
    static String name;
    static String subject;

    Staticmethod(int r, String n, String s) {
        rollno = r;
        name = n;
        subject = s;
    }

    static void display() {
        System.out.println("rollno=" + rollno);
        System.out.println("Name=" + name);
        System.out.println("subject=" + subject);
    }

    public static void main(String args[]) {

        Staticmethod obj = new Staticmethod(1, "Rajan", "opp in java");
        display();
    }
}
