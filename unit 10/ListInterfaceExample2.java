import java.util.*;

public class ListInterfaceExample2 {
    public static void main(String args[]) {
        List<String> l = new ArrayList<String>();
        l.add("Mahima");
        l.add("Nikita");
        l.add("<Mahima");
        l.add("Niru");
        System.out.println("first index of Mahima:" + l.indexOf("Mahima"));
        System.out.println("las index of Mahima:" + l.lastIndexOf("Mahima"));
        System.out.println("first index of Nabin:" + l.indexOf("Nabin"));

    }
}
