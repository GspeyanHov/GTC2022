package chapters.chapter14;

public class NonGen {

    Object ob;

    NonGen(Object o){
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of ob is: " + ob.getClass().getName());
    }
}
class NonGenDemo{
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer)iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Non Generics test ");

        iOb.showType();

        String str = (String)strOb.getOb();
        System.out.println("value: " + str);

        iOb = strOb; //this compiles, but is conceptually wrong! ClassCastException in thread.
        v = (Integer)iOb.getOb(); //this is run-time error

    }
}
