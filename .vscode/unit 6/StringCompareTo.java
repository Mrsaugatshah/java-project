
public class StringCompareTo {
    public static void main(String args[]) {
        String s1 = "Anjila";
        String S2 = "ANJILA";
        String s3 = "Niruta";
        String s4 = "Anjila";

        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s4));
        System.out.println(S2.compareToIgnoreCase(s4));

    }
}
