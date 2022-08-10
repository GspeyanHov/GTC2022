package chapters.chapter11;

public class Producer implements Runnable {

    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{

    Q q;
    Thread t;

    Consumer(Q q){
      this.q = q;
      t = new Thread(this,"Consumer");
    }
    public void run(){
        int i = 0;
        while (true){
            q.get();
        }
    }
}
