package chapters.chapter7;

public class VarArgs {

    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " contents: ");
        for (int i : v) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
