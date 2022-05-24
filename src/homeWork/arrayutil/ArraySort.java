package homeWork.arrayutil;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};

        System.out.print("Unsorted array numbers: ");
        for (int x : numbers) {
            System.out.print(x + "|");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array numbers from smallest to largest: ");
        for (int j : numbers) {
            System.out.print(j + "|");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array numbers from largest to smallest: ");
        for (int number : numbers) {
            System.out.print(number + "|");
        }
    }
}
