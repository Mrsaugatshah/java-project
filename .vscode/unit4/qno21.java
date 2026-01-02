// public class qno21 {

// }
// Parent class
class Parent {
    void showParent() {
        System.out.println("This is parent class");
    }
}

// Child class
class Child extends Parent {
    void showChild() {
        System.out.println("This is child class");
    }
}

// Main class
public class qno21 {
    public static void main(String[] args) {

        // a. Method of parent class by object of parent class
        Parent p = new Parent();
        p.showParent();

        // b. Method of child class by object of child class
        Child c = new Child();
        c.showChild();

        // c. Method of parent class by object of child class
        c.showParent();
    }
}
