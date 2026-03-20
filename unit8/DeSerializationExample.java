
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSerializationExample {
    public static void main(String args[]) {
        student s = null;
        try {
            FileInputStream fin = new FileInputStream(".vscode\\unit8\\Student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);

            s = (student) in.readObject();
            System.out.println("rollno=" + s.rolllno);
            System.out.println("name=" + s.name);
            in.close();
            fin.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
