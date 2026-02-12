public class ValueOfExample {
    public static void main(String args[]) {
        // demonstrating valueof(int i) method
        System.out.println("demonstrating  value of (int i ) method");
        Integer i = Integer.valueOf(50);
        Double d = Double.valueOf(9.36);
        System.out.println(i);
        System.out.println(d);
        // demonstrating value of (String s)method
        System.out.println("Demonstrating valueof(String s) method");
        Integer n = Integer.valueOf("333");
        Integer m = Integer.valueOf("-255");
        System.out.println(n);
        System.out.println(m);
        // demonstrating valueof(String s,int radix) method
        System.out.println("Demonstrating (string s,int radix)method");
        Integer y = Integer.valueOf("333", 8);
        Integer x = Integer.valueOf("-255", 16);
        Long l = Long.valueOf("A", 16);
        System.out.println(n);
        System.out.println(m);
        System.out.println(l);

    }
}
