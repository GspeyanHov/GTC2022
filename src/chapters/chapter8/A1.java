package chapters.chapter8;

public class A1 {

    int i;
}

class B1 extends A1 {
    int i;

    B1(int a, int b) {
        super.i = a;
        i = b;

    }

    void show() {
        System.out.println("i in superClass: " + super.i);
        System.out.println("i in subClass: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B1 subOb = new B1(1,2);
        subOb.show();
    }
}
