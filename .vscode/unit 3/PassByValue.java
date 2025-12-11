public class PassByValue {

    void add(int a, int b) {
        a = a + 3;
        b = b + 3;
    }

    public static void main(String args[]) {
        int a = 5, b = 3;
        PassByValue obj = new PassByValue();
        System.out.println("before function call a=" + a + "b=" + b);
        obj.add(a, b);
        System.out.println("after function cal  a=" + a + "b=" + b);

    }

}