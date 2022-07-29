package chapters.chapter14;

public class TwoGen<T, V> {

    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        System.out.println("Type T is: " + ob1.getClass().getName());
        System.out.println("Type V is: " + ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
class SimpGen{
    public static void main(String[] args) {
        TwoGen<Integer, String> txObj = new TwoGen<>(88, "Generics");

        txObj.showTypes();

        int v = txObj.getOb1();
        System.out.println("value: " + v);

        String str = txObj.getOb2();
        System.out.println("value: " + str);
    }
}
