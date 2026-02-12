import java.util.*;

public class Sublistexample {
    public static void main(String args[]) {
        List<String> names = new ArrayList<String>();
        names.add("c");
        names.add("c++");
        names.add("java");
        names.add("PHP");
        names.add("Python");
        List<String> range = new ArrayList<String>();
        range = names.subList(2, 5);
        System.out.println(range);

    }
}
