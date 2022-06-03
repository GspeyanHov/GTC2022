package homeWork.arrayutil;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[]numbers = {2,4,6,1,9,6};
        ArrayUtil au = new ArrayUtil();
        System.out.println("max = " + au.max(numbers));

        au.allValues(numbers);
        System.out.println();

        System.out.println("min = " + au.min(numbers));

        au.allEvens(numbers);
        System.out.println();

        au.allOdds(numbers);
        System.out.println();

        System.out.println("evenCount: " + au.evenCount(numbers));

        System.out.println("oddCount: " + au.oddCount(numbers));

        System.out.println("Average of the sum of array values is: " + au.average(numbers));

        System.out.println("Amount of array values is: " + au.sum(numbers));

        au.sort(numbers);
        System.out.println();

        au.sortFromMaxToMin(numbers);

    }
}
