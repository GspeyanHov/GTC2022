package chapters.chapter11;

public class NewThread implements Runnable {

    Thread t;

    NewThread(){
        t = new Thread(this, "Demo thread");
        System.out.println("Child Thread " + t);
    }
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted ");
        }
        System.out.println("Exiting child Thread ");
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();

        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + nt);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted ");
        }
        System.out.println("Main Thread exiting ");
    }
}
