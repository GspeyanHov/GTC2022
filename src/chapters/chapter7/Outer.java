package chapters.chapter7;

public class Outer {

    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outer x = " + outerX);
        }
    }
}

class InnerClassDemo {

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}