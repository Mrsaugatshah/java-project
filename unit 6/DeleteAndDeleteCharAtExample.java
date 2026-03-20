public class DeleteAndDeleteCharAtExample {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("oop in java");
        System.out.println(s);
        s.delete(2, 7);
        System.out.println(s);
        StringBuffer str = new StringBuffer("bca 3rd semester");
        str.deleteCharAt(2);
        System.out.println(str);
    }
}
