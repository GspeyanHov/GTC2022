package chapters.chapter9;

public class AnotherClient implements Callback {
    public void callBack(int p) {
        System.out.println("Another version of callback ");
        System.out.println("p squared is " + (p * p));
    }

}

class TestIFace2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callBack(42);
        c = ob;
        c.callBack(42);
    }

}
