// WAP to write three student information (rollno, name, address, college name)
// into file student.txt and display the student information whose address is Chitwan

import java.io.*;
import java.util.Scanner;

public class qnoFile {

    public static void main(String args[]) {

        try {

            File f = new File("student.txt");

            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int rollno, i, n;
            String name, address, cname;

            Scanner sc = new Scanner(System.in);

            System.out.print("Number of students: ");
            n = sc.nextInt();

            for (i = 0; i < n; i++) {
                System.out.print("\nRollno: ");
                rollno = sc.nextInt();

                System.out.print("Name: ");
                name = sc.next();

                System.out.print("Address: ");
                address = sc.next();

                System.out.print("College Name: ");
                cname = sc.next();

                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }

            dos.close();

            System.out.println("\nRollno\tName\tAddress\tCollege");

            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);

            for (i = 0; i < n; i++) {
                rollno = dis.readInt();
                name = dis.readUTF();
                address = dis.readUTF();
                cname = dis.readUTF();

                if (address.compareToIgnoreCase("Chitwan") == 0) {
                    System.out.println(rollno + "\t" + name + "\t" + address + "\t" + cname);
                }
            }

            dis.close();

        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}