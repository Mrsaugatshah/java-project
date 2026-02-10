public class UnboxingExample {
    public static void main(String args[]) {
        // converting Integer to int
        Integer a = new Integer(3);
        /* converting Integer to int expliicitly */
        int i = a.intValue();
        /* unboxing ,now compilor will write a.intValue() internally */
        int j = a;
        System.out.println(a + " " + i + " " + j);
    }
}
