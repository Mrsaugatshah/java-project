import java.util.HashSet;

public class Qno46 {
    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<String>();

        courses.add("BCA");
        courses.add("BBA");
        courses.add("BSCCSIT");
        courses.add("BE");

        System.out.println("Elements in HashSet:");
        for (String c : courses) {
            System.out.println(c);
        }
    }
}