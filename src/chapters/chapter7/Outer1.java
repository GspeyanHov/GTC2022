package chapters.chapter7;

public class Outer1 {

    int outerX = 100;
    
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner{
                void display(){
                    System.out.println("outer x = " + outerX);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo1{
    public static void main(String[] args) {
        Outer1 out = new Outer1();
        out.test();
    }

}
