// thread without synchronization
class MultiplicationTable1 {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "x" + i + "=" + n * i);
            try {
                Thread.sleep(400);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread3 extends Thread {
    MultiplicationTable1 t;

    Thread3(MultiplicationTable1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread4 extends Thread {
    MultiplicationTable1 t;

    Thread4(MultiplicationTable1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SynchronizeMethod {
    public static void main(String args[]) {
        MultiplicationTable1 obj = new MultiplicationTable1();
        Thread3 t1 = new Thread3(obj);
        Thread4 t2 = new Thread4(obj);
        t1.start();
        t2.start();
    }
}
