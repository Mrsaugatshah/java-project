import java.util.*;

public class ListInterfaceExample {
    public static void main(String args[]) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 5);
        l1.add(1, 7);
        System.out.println(l1);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(6);
        l2.add(9);
        l2.add(15);
        System.out.println(l2);
        l1.addAll(1, l2);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        l1.set(0, 15);
        l1.set(0, 15);
        System.out.println(l1);

    }
}
