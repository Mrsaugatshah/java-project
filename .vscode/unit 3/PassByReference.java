public class PassByReference {
    int a = 5, b = 10;

    void sum(PassByReference ob) {
        ob.a = ob.a + 3;
        ob.b = ob.b + 3;
    }

    public static void main(String args[]) {
        PassByReference obj = new PassByReference();
        System.out.println("before functon call a=" + obj.a + "b=" + obj.b);
        obj.sum(obj);
        System.out.println("after fuction call a=" + obj.a + "b=" + obj.b);
    }
}
