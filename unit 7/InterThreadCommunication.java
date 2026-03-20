class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        if (this.amount < amount) {

            System.out.println("less balace:  waiting for deposite...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount = this.amount - amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to  deposit...");
        this.amount = this.amount + amount;
        System.out.println("deposit completed...");
        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(12000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(5000);
            }
        }.start();
    }

}
