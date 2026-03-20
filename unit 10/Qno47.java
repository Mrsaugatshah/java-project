import java.util.Arrays;

public class Qno47 {
    public static void main(String[] args) {

        String cities[] = { "Kathmandu", "Pokhara", "Biratnagar", "Lalitpur", "Bhaktapur" };

        Arrays.sort(cities);

        System.out.println("Cities in Ascending Order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}