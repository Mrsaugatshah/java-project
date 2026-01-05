class evenThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class oddThread extends Thread {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String args[]) {
        evenThread obj1 = new evenThread();
        oddThread obj2 = new oddThread();
        obj1.setName("Even thread");
        obj2.setName("Odd thread");
        obj1.start();
        obj2.start();
    }
}
