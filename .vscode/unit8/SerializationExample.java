import java.io.*;

public class SerializationExample {
    public static void main(String args) {
        student s = new student();
        s.rolllno = 5;
        s.name = "Saline";
        try {
            FileOutputStream fout = new FileOutputStream("D:\\student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.close();
            fout.close();
            System.out.println("Serializad dat is saved in Student.ser");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}