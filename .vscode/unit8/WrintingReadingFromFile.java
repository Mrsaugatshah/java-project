
//wap  to write three student information (rollno, naem ,address,collegenaeme) file student.txt and display the student inforamton which address is java
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WrintingReadingFromFile {
    public static void main(String args[]) throws IOException {
        try {
            File f = new File("D:\\student.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            int i, n, rollno;
            String name, address, cname;
            Scanner sc = new Scanner(System.in);
            System.out.print("no of student: ");
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                System.out.print("\nRollno: ");
                rollno = sc.nextInt();
                System.out.print("name: ");
                name = sc.next();
                System.out.print("Address: ");
                address = sc.next();
                System.out.print("collage name: ");
                cname = sc.next();
                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }
            System.out.println("\nrollno\tname\taddress\tcollege name");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            for (i = 0; i < n; i++) {
                rollno = dis.readInt();
                name = dis.readUTF();
                address = dis.readUTF();
                cname = dis.readUTF();
                if (address.compareToIgnoreCase("Jhapa") == 0)
                    System.out.println(rollno + "\t" + name + "\t" + address + "\t" + cname);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
