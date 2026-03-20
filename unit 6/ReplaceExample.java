public class ReplaceExample {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("bca 3rd semester");
        System.out.println(s);
        s.replace(4, 7, "third");
        System.out.println(s);
    }
}
