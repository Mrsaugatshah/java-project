
class Lowercase1 implements Runnable {
    public void run() {
        for (char i = 'a'; i <= 'z'; i++)
            System.out.print(i + " ");

    }

    class Uppercase implements Runnable {
        public void run() {
            for (char i = 'A'; i <= 'Z'; i++)
                System.out.print(i + " ");
        }
    }
}

public class ThreadExample2 {
    public static void main(String args[]) {
        Uppercase obj1 = new Uppercase();
        Lowercase1 obj2 = new Lowercase1();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }

}
