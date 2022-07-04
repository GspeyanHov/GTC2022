package chapters.chapter9;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "default String";
    }
}
class MyIfImp implements MyIf{
    @Override
    public int getNumber() {
        return 100;
    }
}
class DefaultMethodDemo{
    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();
        System.out.println(obj.getNumber());

        System.out.println(obj.getString());

    }
}

