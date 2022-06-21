package chapters.chapter8;

import org.w3c.dom.ls.LSOutput;

public class A2 {

    A2(){
        System.out.println("Inside A2's constructor ");
    }
}
class B2 extends A2{
    B2(){
        System.out.println("inside B2's constructor ");
    }
}
class C1 extends B2{
    C1(){
        System.out.println("inside C's constructor");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C1 c = new C1();
    }
}
