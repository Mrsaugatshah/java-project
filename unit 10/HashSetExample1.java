import java.util.*;

public class HashSetExample1 {
    public static void main(String args[]) {
        HashSet<String> s = new HashSet<>();
        s.add("ram");
        s.add("hari");
        s.add("pinku");
        s.add("bablu");
        s.add("anik");
        s.add("bablu");
        System.out.println(s);
        s.remove("hari");
        System.out.println(s);
        System.out.println("\nIterating  over list: ");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
