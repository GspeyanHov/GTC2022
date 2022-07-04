package chapters.chapter10;

public class ThrowDemo {

    static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        } catch(NullPointerException e){
            System.out.println("caught inside demoproc ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught: " + e);
        }
    }
}
