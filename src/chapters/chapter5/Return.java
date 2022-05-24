package chapters.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("before return ");
        if(t){
            return;
        }
        System.out.println("this statement wont be displayed. ");
    }
}
