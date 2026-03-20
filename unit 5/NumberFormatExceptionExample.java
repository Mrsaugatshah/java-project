public class NumberFormatExceptionExample {
    public static void main(String args[]) {
        try {
            int a = Integer.parseInt("Soba Raj");

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }

}
