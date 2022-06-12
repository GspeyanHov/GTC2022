package chapters.chapter7;

public class OverloadDemo {

    void test() {
        System.out.println("no parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;
        od.test();
        od.test(10);
        od.test(10,20);
        result =  od.test(123.25);
        System.out.println("result = od.test (123.25): " + result);
    }
}
