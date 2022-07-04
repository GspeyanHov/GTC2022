package chapters.chapter10;

public class ChainExcDemo {

    static void demoproc(){
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("caught: " + e);
            System.out.println("original cause: " + e.getCause());
        }
    }
}
