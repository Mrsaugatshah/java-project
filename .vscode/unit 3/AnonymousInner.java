abstract class AnonymousInner {
    public abstract void mymethod();

}

class outerClass {
    public static void main(String args[]) {
        AnonymousInner obj = new AnonymousInner() {
            public void mymethod() {
                System.out.println("this is an example of anonymous inner");
            }
        };
        obj.mymethod();
    }
}
