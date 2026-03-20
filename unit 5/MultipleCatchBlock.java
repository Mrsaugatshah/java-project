public class MultipleCatchBlock {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[2] = 6 / 2;
            System.out.println(a[7]);
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exceptionoccurs");
        }
    }
}
