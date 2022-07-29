package chapters.chapter14;

public class Gen1<T> {

    T ob;

    Gen1(T o){
        ob = o;
    }
    T getOb(){
        return  ob;
    }
}
class Gen2<T, V> extends Gen1 <T>{

    V ob2;

    Gen2(T o, V o2){
        super(o);
        ob2 = o2;
    }
    V getOb2(){
        return ob2;
    }
}
class HierDemo{
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

