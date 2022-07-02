package chapters.chapter9;

public class TestIFace {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callBack(42);
    }
}
