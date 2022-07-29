package chapters.chapter14;

public class HierDemo3 {

    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);

        Gen1<Integer> iob2 = new Gen1<>(99);

        Gen<String> strOb2 = new Gen<>("Generic tests: ");

        if(iob2 instanceof Gen1<?>){
            System.out.println("iob2 is instanceof Gen1 ");
        }
        if(iob instanceof Gen){
            System.out.println("iob2 instanceof Gen ");
        }
        System.out.println();

        if(iob2 instanceof Gen2){
            System.out.println("iob2 instanceof Gen2 ");
        }
        if(strOb2 instanceof Gen){
            System.out.println("strOb2 instanceof Gen ");
        }
        System.out.println();

        if(strOb2 instanceof Gen<?>){
            System.out.println("strOb2 is instanceof Gen ");
        }
        if(iob2 instanceof Gen1<?>){
            System.out.println("iob2 is instanceof Gen1 ");
        }
    }

}
