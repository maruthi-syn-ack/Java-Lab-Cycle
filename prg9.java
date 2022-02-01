class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() // this is used to lock an object for a shared resource....
    {
        while (!valueSet) // !valueSet = true

            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interpted Exception Caught");
            }

        System.out.println("Got:" + n);

        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)

            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put :" + n);
        notify();

    }
}

class prod implements Runnable {
    Q q;

    prod() {
    }

    prod(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class cons implements Runnable {
    Q q;

    cons() {
    }

    cons(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class Program9 {
    public static void main(String args[]) {
        Q q = new Q();
        new prod(q);
        new cons(q);
        System.out.println("Press ctrl + C to Stop");
    }
}
