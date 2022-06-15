package chapters.chapter7;

public class VarArgs3 {

    static void vaTest(int...v){
        System.out.print("vaTest(int...): " + "Number of args: " + v.length + " contents: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.print("vaTest(boolean...): " + "Number of args: " + v.length + " contents: ");
        for (boolean b : v) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
    static void vaTest(String msg, int...v){
        System.out.print("vaTest(String, int...): " + "Number of args: " + v.length + "contents: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Testing: ",10,20);
        vaTest(true,false,false);
    }
}
