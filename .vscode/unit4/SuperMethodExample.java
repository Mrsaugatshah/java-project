class supermethod {
    void display() {
        System.out.println("Display method inside SuperMehtod class");

    }

}

public class SuperMethodExample extends supermethod {
    void display() {
        System.out.println("display method inside super method example");
    }

    void show() {
        super.display();
        display();
    }

    public static void main(String args[]) {
        SuperMethodExample obj = new SuperMethodExample();
        obj.show();
    }
}
