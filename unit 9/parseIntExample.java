public class parseIntExample {
    public static void main(String args[]) {
        // parsing different strings
        int z = Integer.parseInt("15", 8);
        int a = Integer.parseInt("A", 16);
        long l = Long.parseLong("2158611234", 10);
        System.out.println(z);
        System.out.println(a);
        System.out.println(l);

    }
}
