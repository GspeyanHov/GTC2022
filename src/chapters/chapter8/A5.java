package chapters.chapter8;

import javax.crypto.spec.RC5ParameterSpec;

public class A5 {

    void callMe(){
        System.out.println("Inside A's callMe method ");
    }
}
class B5 extends A5{
    void callMe(){
        System.out.println("Inside B's callMe method ");
    }
}
class C2 extends A5{
    void callMe(){
        System.out.println("Inside C's callMe method ");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C2 c = new C2();

        A5 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
