package chapters.chapter9;

public interface MyIf1 {

    int getNumber();

    default String getString(){
        return "default String";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
