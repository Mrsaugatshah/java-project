
//WAP to create set with following value: London, New York, Sanfrancisco, Belfing, New York erfoorm Following operation on above set.
//- add new elements
// - get set size - remove element - contains element?
// - addALL
// - remove all
// - retato ALZ */
import java.util.*;

public class HeshSetExample2 {
    public static void main(String args[]) {
        Set<String> city = new HashSet<>(Arrays.asList("London", "new Yortk", "SanFrancisco", "Beijing", "New York"));
        System.out.println(city);
        city.add("Kathmandu");
        System.out.println("after adding 'kathmandu in set" + city);
        System.out.println("Size of set is:" + city.size());
        city.remove("London");
        System.out.println("After removing 'london' from set: " + city);
        System.out.println("contains 'kathmandu' in list? " + city.contains("kathmandu"));
        Set<String> newcity = new HashSet<>(Arrays.asList("Sydney", "Delhi"));
        city.addAll(newcity);
        System.out.println("after addall:" + city);
        city.removeAll(newcity);
        System.out.println("After removeAll:" + city);
        Set<String> retaincity = new HashSet<>(Arrays.asList("Beijing", "New York"));
        city.retainAll(retaincity);
        System.out.println("After retainall: " + city);

    }
}
