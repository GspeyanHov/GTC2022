package chapters.chapter14;

public class NonGen1 {

    int num;

    NonGen1(int i){
        num = i;
    }
    int getNum(){
        return num;
    }
}
class Gen3<T>extends NonGen1{
    T ob;

    Gen3(T o, int i){
        super(i);
        ob = o;
    }
    T getOb(){
        return ob;
    }
}
class HierDemo2{
    public static void main(String[] args) {
        Gen3<String> w = new Gen3<>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.print(w.getNum());
    }
}
