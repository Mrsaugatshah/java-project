// thread without synchronization
class MultiplicationTable2 {
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

class Thread5 extends Thread {
    MultiplicationTable2 t;

    Thread5(MultiplicationTable2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread6 extends Thread {
    MultiplicationTable2 t;

    Thread6(MultiplicationTable2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SynchronizeBlock {
    public static void main(String args[]) {
        MultiplicationTable2 obj = new MultiplicationTable2();
        Thread5 t1 = new Thread5(obj);
        Thread6 t2 = new Thread6(obj);
        t1.start();
        t2.start();
    }
}
