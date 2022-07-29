package chapters.chapter14;

public class Stats<T extends Number> {

    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}

class BoundsDemo {
    public static void main(String[] args) {

        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(iNums);
        Double v = iob.average();
        System.out.println("iob average is: " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dNums);
        Double w = dob.average();
        System.out.println("dob average is: " + w);

//        This is will not compile, because String is not sub class of number

//        String[] str = {"1","2","3"};
//        Stats<String>strOb = new Stats<>(str);
//        Double x = strOb.average();
//        System.out.println("strOb average is: " + x);
    }
}
