import java.util.*;

public class LinkedListexample {
    public static void main(String args[]) {

        LinkedList<String> s = new LinkedList<>();

        s.add("d");
        s.addFirst("a");
        System.out.println(s);

        s.add(1, "b");
        System.out.println(s);

        boolean status = s.contains("G");

        if (status)
            System.out.println("List contains element 'G'");
        else
            System.out.println("List does not contain element 'G'");

        s.remove(1);
        System.out.println(s);

        s.remove("b");
        System.out.println(s);
    }
}