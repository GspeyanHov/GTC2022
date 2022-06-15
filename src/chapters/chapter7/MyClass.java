package chapters.chapter7;

public class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) {
            i = k;
        }

    }
}

class RefVarDemo {
    public static void main(String[] args) {
        var mC = new MyClass(10);
        System.out.println("Value of i in mc is " + mC.geti());
        mC.seti(19);
        System.out.println("Value of i in mc is now " + mC.geti());

    }
}