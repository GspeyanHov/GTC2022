package chapters.chapter14;

public class Stats1<T extends Number> {

    T[] nums;

    Stats1(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats1<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

class WildCardDemo {
    public static void main(String[] args) {

        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats1<Integer> iob = new Stats1<>(iNums);
        Double v = iob.average();
        System.out.println("iob average is: " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> dob = new Stats1<>(dNums);
        Double w = dob.average();
        System.out.println("dob average is: " + w);

        Float[] fNums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> fob = new Stats1<>(fNums);
        Double x = fob.average();
        System.out.println("fob average is: " + x);

        System.out.println("Averages of iob and dob ");
        if(iob.sameAvg(dob)){
            System.out.println("are the same ");
        }else {
            System.out.println("differ ");
        }
        System.out.println("Averages of iob and fob");
        if(iob.sameAvg(fob)){
            System.out.println("are the same ");
        }else{
            System.out.println("differ ");
        }
    }
}
