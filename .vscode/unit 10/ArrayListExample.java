import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> s = new ArrayList<>();
        s.add("ram");
        s.add("Bindu");
        s.add("ramu");
        ListIterator litr = s.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

    }
}