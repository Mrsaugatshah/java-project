public class GetCharsExample {
    public static void main(String args[]) {
        String s1 = "i am learning java programming language ";
        int start = 7;
        int end = 15;
        char s2[] = new char[end - start];
        s1.getChars(start, end, s2, 0);
        System.out.println(s2);
    }
}
