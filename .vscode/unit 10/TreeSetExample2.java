
//write a program to sort name of n cities in ascending order
import java.util.*;

public class TreeSetExample2 {
    public static void main(String args[]) {
        TreeSet<String> s = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int i, n;
        String cityname;
        System.out.print("how many Cities");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("enter name of city:");
            cityname = sc.next();
            s.add(cityname);
        }
        System.out.println("iterating overlist: ");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
