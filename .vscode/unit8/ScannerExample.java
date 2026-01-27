import java.util.Scanner;

public class ScannerExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String naem = sc.next();
        System.out.print("Gender:");
        char gender = sc.next().charAt(0);
        System.out.print("Age: ");
        int Age = sc.nextInt();
        System.out.print("Mobile no: ");
        long mobileno = sc.nextLong();
        System.out.print("Gpa: ");
        double gpa = sc.nextDouble();
        System.out.println("\n naem:" + naem);
        System.out.println("\n naem:" + gender);
        System.out.println("\n naem:" + Age);
        System.out.println("\n naem:" + mobileno);
        System.out.println("\n naem:" + gpa);

    }
}
