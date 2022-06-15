package chapters.chapter7;

public class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " contents: ");
        for (int i : v) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", +10);
        vaTest("Three vararg: ", +1, 2, 3);
        vaTest("No vararg: ");
    }
}
