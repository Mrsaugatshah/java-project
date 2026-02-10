public class EqualsExample {
    public static void main(String args[]) {
        // creating a short class object with value "15"
        Short s = new Short("15");
        // creating a Integer class object with value "10"
        Short x = 10;

        Integer y = 15;
        // creating another short class object with value //"15"
        Short z = 15;
        // comparing s with other objects
        System.out.println(s.equals(x));
        System.out.println(s.equals(y));
        System.out.println(s.equals(z));
    }
}
