

    A(B obj) {
        this.obj = obj;
        obj.display();
    }
}

class B {
    int x = 5;

    B() {
        A obj = new A(this);

    }

    void display() {
        System.out.println("value of x in class B:" + x);
    }

    public static void main(String[] args) {
        B obj = new B();

    }

}