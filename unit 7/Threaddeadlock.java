
public class Threaddeadlock {
    String str1 = "java";
    String str2 = "python";
    Thread t1 = new Thread("My Thread 1") {
        public void run() {
            while (true) {
                synchronized (str1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    synchronized (str2) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };
    Thread t2 = new Thread("My Thread 2") {
        public void run() {
            while (true) {
                synchronized (str2) {
                    synchronized (str1) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    public static void main(String args[]) {
        Threaddeadlock obj = new Threaddeadlock();
        obj.t1.start();
        obj.t2.start();
    }

}
