package chapters.chapter11;

public class Q {
    int n;
    boolean valueset = false;

    synchronized int get(){
        while (!valueset){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("interruptedException caught");
            }
        }
        System.out.println("got: " + n);
        valueset = false;
        notify();
        return n;
    }
    synchronized void put(int i){
        while (valueset){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("InterruptedException caught ");
            }
        }
        this.n = n;
        valueset = true;
        System.out.println("put: " + n);
        notify();
    }
}

