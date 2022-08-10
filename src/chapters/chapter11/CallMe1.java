package chapters.chapter11;

public class CallMe1 {

    void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.print("Interrupted");
        }
        System.out.print("]");
    }
}
class Caller1 implements Runnable{

    String msg;
    CallMe1 target;
    Thread t;

    public Caller1(CallMe1 targ, String s){
        msg = s;
        target = targ;
        t = new Thread(this);
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
class Synch1{
    public static void main(String[] args) {
        CallMe1 target = new CallMe1();
        Caller1 ob1 = new Caller1(target,"Hello");
        Caller1 ob2 = new Caller1(target,"synchronized");
        Caller1 ob3 = new Caller1(target,"World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}