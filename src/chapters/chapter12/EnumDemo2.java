package chapters.chapter12;

public class EnumDemo2 {

    public static void main(String[] args) {

        Apple ap;

        System.out.println("Hre are all apple constants");

        Apple[] allApples = Apple.values();
        for(Apple a : allApples)
            System.out.println(a);
        System.out.println();

        ap = Apple.valueOf("Winesap".toUpperCase());
        System.out.println("ap contains: " + ap);
    }
}
