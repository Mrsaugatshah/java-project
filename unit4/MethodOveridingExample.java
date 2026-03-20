class MethodOveriding {
    void display() {

        System.out.println("this is display method inside methodoveriding");
    }
}

public class MethodOveridingExample extends MethodOveriding {
    void display() {
        System.out.println("thid id display mehtod inside methodoveriding");
    }

    public static void main(String args[]) {
        MethodOveriding obj1 = new MethodOveriding();
        MethodOveriding obj2 = new MethodOveridingExample();
        obj1.display();
        obj2.display();
    }

}
