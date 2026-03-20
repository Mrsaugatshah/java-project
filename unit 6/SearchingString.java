public class SearchingString {
    public static void main(String args[]) {
        String s = "bca 3rd semester";
        int id = s.indexOf("3");
        if (id == -1)
            System.out.println("third not found");
        else
            System.out.println("found at index" + id);
    }
}
