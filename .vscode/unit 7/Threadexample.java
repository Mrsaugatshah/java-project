class Lowercase extends Thread {
    public void run() {
        for (char i = 'a'; i <= 'z'; i++)
            System.out.print(i + " ");
    }
}

class Uppercase extends Thread {
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++)
            System.out.print(i + " ");
    }
}

public class Threadexample {
    public static void main(String args[]) {
        Uppercase obj1 = new Uppercase();
        Lowercase obj2 = new Lowercase();
        obj1.start();
        obj2.start();
    }
}
