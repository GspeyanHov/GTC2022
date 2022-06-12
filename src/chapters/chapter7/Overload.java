package chapters.chapter7;

public class Overload {

    void test() {
        System.out.println("no parameters");
    }

    void test(int a, int b) {
        System.out.println("double and b: " + a + ", " + b);
    }

    void test(double a) {
        System.out.println("double a:" + a);
    }

    public static void main(String[] args) {
        Overload ob = new Overload();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(88);
        ob.test(123.2);
    }
}
