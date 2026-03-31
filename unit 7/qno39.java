import java.io.*;

class Student implements Serializable {
    int rollno;
    String name;
}

public class qno39 {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollno = 22;
        s.name = "saugat";

        try {
            FileOutputStream fout = new FileOutputStream("C:/Users/sauga/Documents/student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.close();
            System.out.println("Serialized data is saved");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}