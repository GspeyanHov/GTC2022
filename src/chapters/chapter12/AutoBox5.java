package chapters.chapter12;

public class AutoBox5 {

    public static void main(String[] args) {

        Boolean b = true;
        if(b){
            System.out.println("b is true");
        }
        Character ch = 'X';
        char ch2 = ch;
        System.out.println("ch2 is: " + ch);
    }
}
