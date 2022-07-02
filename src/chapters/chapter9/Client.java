package chapters.chapter9;

public class Client implements Callback {
    public void callBack(int p){
        System.out.println("Callback called with " + p);
    }
    void noneIFaceMeth(){
        System.out.println("classes that implement interfaces " + "may also define other members too ");
    }
}
