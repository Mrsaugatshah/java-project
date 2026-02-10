
//Reading Miscellaneous data from user
import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Mobile No: ");
        long mobileno = sc.nextLong();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        System.out.println("\nName: " + name);
        System.out.println("\nGender: " + gender);
        System.out.println("\nAge: " + age);
        System.out.println("\nMobileno: " + mobileno);
        System.out.println("\nGPA: " + gpa);
    }
}
