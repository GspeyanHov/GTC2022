package homeWork.dynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        System.out.println(da.isEmpty());

        da.add(7);
        da.add(15);
        da.add(25);
        da.add(30);
        da.add(25);
        da.printArray();

        System.out.println();

        System.out.println(da.getByIndex(2));

        System.out.println(da.getFirstIndexByValue(30));

        da.set(3,45);
        da.printArray();

        System.out.println();

        da.add(4,77);
        da.printArray();

        System.out.println();

        da.delete(2);
        da.printArray();

    }

}
