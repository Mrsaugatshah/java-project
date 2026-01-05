public class LengthCapacity {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("bca 3rd semester");
        int l = s.length();
        int c = s.capacity();
        System.out.println("length of given string=" + l);
        System.out.println("capacity of given string=" + c);

    }
}
