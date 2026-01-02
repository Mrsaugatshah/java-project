import java.util.Scanner;

public class CollegeNameRead {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String collegename;
        System.out.print("enter college name:");
        collegename = sc.nextLine();
        try {
            if (collegename.length() > 50) {
                throw new IllegalArgumentException("college name length is greater than 50");
            }
            System.out.println("college name:" + collegename);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
