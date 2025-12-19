
class SuperVariable {
    int num = 5;
}

public class SuperVariableExample extends SuperVariable {
    int num = 10;

    void display() {
        System.out.println("value of num is SuperVariable class=" + super.num);
        System.out.println("value of num is SuperVariableExample class=" + num);
    }

    public static void main(String args[]) {
        SuperVariableExample obj = new SuperVariableExample();
        obj.display();
    }
}
