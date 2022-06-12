package chapters.chapter7;

import java.util.concurrent.Callable;

public class CallByValue {

    int i, j;

    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
    void meth(CallByValue o){
       o.i *= 2;
       o.j /= 2;
    }

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        CallByValue o = new CallByValue();

        int i = 15;
        int j = 20;

        o.i = 15;
        o.j = 20;

        System.out.println("i and j before call: " + i + " " + j);

        ob.meth(i, j);

        System.out.println("i and j after call: " + i + " " + j);

        System.out.println("i and j before call: " + o.i + " " + o.j);

        o.meth(o);
        System.out.println("i and j after call: " + o.i + " " + o.j);

    }
}
