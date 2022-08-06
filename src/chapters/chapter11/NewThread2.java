package chapters.chapter11;

public class NewThread2 implements Runnable {

    Thread t;
    String name;

    NewThread2(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New Thread: " + t);
    }


    @Override
    public void run() {
      try{
          for (int i = 5; i > 0; i--) {
              System.out.println(name + ": " + i);
              Thread.sleep(1000);
          }
      }catch (InterruptedException e){
          System.out.println(name + " interrupted ");
      }
        System.out.println(name + " exiting");
    }
}
class MultiThreadDemo{
    public static void main(String[] args) {
        NewThread2 nt1 = new NewThread2("One");
        NewThread2 nt2 = new NewThread2("Two");
        NewThread2 nt3 = new NewThread2("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try{
           Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted ");
        }
        System.out.println("Main Thread exiting");
    }
}