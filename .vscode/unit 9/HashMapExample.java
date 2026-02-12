import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "subal");
        map.put(2, "sanvi");
        map.put(2, "sonu");
        map.put(3, "laxmi");
        System.out.println(map);
        System.out.println("\nIteration Hashmap...");
        for (Map.Entry i : map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
