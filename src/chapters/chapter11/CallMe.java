package chapters.chapter11;

public class CallMe {

    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }
}

class Caller implements Runnable {

    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s) {

        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "synchronized");
        Caller ob3 = new Caller(target, "World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
