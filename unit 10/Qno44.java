import java.util.Arrays;

public class Qno44 {
    public static void main(String[] args) {

        // Declare and initialize string array
        String[] names = { "Saugat", "Ram", "Anita", "Bikash", "Mohan" };

        // Display original array
        System.out.println("Original Array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sort the array
        Arrays.sort(names);

        // Display sorted array
        System.out.println("\nSorted Array:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}