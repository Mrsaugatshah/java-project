public class StaticBlock {
    static int rollno;
    static String name;
    static String subject;
    static {
        rollno = 1;
        name = "bimal";
        subject = "opp in java";
    }

    void display() {
        System.out.println("rollno=" + rollno);
        System.out.println("rollno=" + name);
        System.out.println("rollno=" + subject);

    }

    public static void main(String args[]) {
        StaticBlock obj = new StaticBlock();
        obj.display();
    }
}
