public class AutoboxingExample {
    public static void main(String args[]) {
        // coverting int into integer
        int a = 20;
        /* converting int into Integer explicitly */
        Integer i = Integer.valueOf(a);
        // autoboxing now compiler will write Integer.valueOf(a) intternallly
        Integer j = a;
        System.out.println(a + " " + i + " " + j);

    }
}
