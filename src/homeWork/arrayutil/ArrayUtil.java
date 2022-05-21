package homeWork.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] arr = {0, 5, 6, 12, 45, 3, 8, 9, 7, 4, 54, 87, 74, 95, 18};

        // 1. մասիվի բոլոր էլեմենտները

        System.out.print("Array values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(".......................................");

        // 2. մասիվի ամենամեծ թիվը, և թվի ինդեքսը

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum value in an array: " + max);
        System.out.println("Maximum value's index in an array: " + index);
        System.out.println("..........................................");

        // 3. մասիվի ամենափոքրը թիվը, և թվի ինդեքսը

        int min = arr[0];
        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                arr[i] = min;
                point = i;
            }
        }
        System.out.println("Minimum value in an array: " + min);
        System.out.println("Minimum value's index in an array: " + point);
        System.out.println(".........................................");

        // 4. մասիվի բոլոր զույգ էլեմենտները

        System.out.print("All even values in an array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("........................................");

        // 5. մասիվի բոլոր կենտ էլեմենտները

        System.out.print("All odd values in an array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("........................................");


        // 6. զույգերի քանակը

        int quantity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                quantity++;
        }
        System.out.println("Even values quantity in an array: " + quantity);
        System.out.println("............................................");

        // 7.կենտերի քանակը

        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                amount++;
        }
        System.out.println("Odd values quantity in an array: " + amount);
        System.out.println("............................................");


        // 8. մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println("The average of the sum of the values in an array: " + average);
        System.out.println("...................................");

        // 9. մասիվի էլեմենտների գումարը։

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println("The sum of the values in an array: " + count);
        System.out.println("......................................");
    }
}
