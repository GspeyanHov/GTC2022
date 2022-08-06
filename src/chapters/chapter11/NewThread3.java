package chapters.chapter11;

public class NewThread3 implements Runnable {

    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One isAlive: " + nt1.t.isAlive());
        System.out.println("Thread Two isAlive: " + nt2.t.isAlive());
        System.out.println("Thread Three isAlive: " + nt2.t.isAlive());

        try{
            System.out.println("Waiting for Threads to finish ");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted ");
        }
        System.out.println("Thread One isAlive: " + nt1.t.isAlive());
        System.out.println("Thread Two isAlive: " + nt2.t.isAlive());
        System.out.println("Thread Three isAlive: " + nt2.t.isAlive());
        System.out.println("Main thread exiting ");
    }
}
