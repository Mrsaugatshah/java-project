import java.util.*;

public class TreeSetexample {
    public static void main(String args[]) {
        TreeSet<String> s = new TreeSet<>();
        s.add("Devendra");
        s.add("Bindu");
        s.add("hari");
        s.add("binayak");
        s.add("soba raj");
        s.add("binayak");
        System.out.println(s);
        s.remove("soba raj");
        System.out.println("\nIterating over list");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
