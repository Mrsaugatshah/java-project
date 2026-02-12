import java.util.*;

public class mapExample {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ashika", 100);
        map.put("sarmila", 101);
        map.put("pratima", 102);
        System.out.println(map);
        System.out.println(map.get("sarmila"));
        System.out.println(map.containsKey("sarmila"));
        System.out.println(map.containsValue(101));

        // tranverse
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
