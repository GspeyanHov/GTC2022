package chapters.chapter12;

public class EnumDemo3 {

    public static void main(String[] args) {

        Apple ap;

        System.out.println("Winesap cost's " + Apple.WINESAP.getPrice() + " cents.\n");
        
        
        System.out.println("All apple prices: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " cost's " + a.getPrice() + " cents ");
        }
    }
}
