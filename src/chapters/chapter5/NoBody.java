package chapters.chapter5;

public class NoBody {

    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < --j) {
        }
        System.out.println("The middle value is: " + i);
    }
}
