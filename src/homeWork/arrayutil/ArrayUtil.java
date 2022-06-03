package homeWork.arrayutil;

public class ArrayUtil {

    //1.գրել max գտնելու լոգիկան, ու վերադարձնել այն

    int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // 2. մասիվի բոլոր էլեմենտները

    int allValues(int[] arr) {
        int nums = 0;
        System.out.print("allValues: ");
        for (int i = 0; i < arr.length; i++) {
            nums = arr[i];
            System.out.print(nums + "|");
        }
        return nums;
    }

    // 3. մասիվի ամենափոքրը թիվը

    int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // 4. մասիվի բոլոր զույգ էլեմենտները

    int allEvens(int[] arr) {
        System.out.print("allEvens: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + "|");
            }
        }
        return -1;
    }

    // 5. մասիվի բոլոր կենտ էլեմենտները

    int allOdds(int[] arr) {
        System.out.print("allOdds: ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + "|");
            }
        }
        return -1;
    }

    // 6. զույգերի քանակը

    int evenCount(int[] arr) {
        int evenCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    // 7.կենտերի քանակը

    int oddCount(int[] arr) {
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    // 8. մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

    double average(int[] arr) {
        double average = 0;
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return average = sum / arr.length;
    }

    // 9. մասիվի էլեմենտների գումարը։

    int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 10.մասիվի սորտավորում

    int sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.print("Sorted array from min to max: ");
        for (int i : arr) {
            System.out.print(i + "|");
        }
        return -1;
    }

    // 11.մասիվի սորտավորում մեծից փոքր

    int sortFromMaxToMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.print("Sorted array from max to min: ");
        for (int i : arr) {
            System.out.print(i + "|");
        }
        return -1;
    }

    //------------------------------------------------------------------------------------------------------//

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
            if (arr[i] % 2 != 0) {
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
            if (arr[i] % 2 != 0)
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
