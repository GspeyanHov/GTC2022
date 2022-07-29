package chapters.chapter14;

public interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

class GenIfDemo {
    public static void main(String[] args) {
        Integer[] nums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'v'};

        MyClass<Integer> iob = new MyClass<>(nums);
        MyClass<Character> ch = new MyClass<>(chs);

        System.out.println("Max value in nums: " + iob.max());
        System.out.println("Max value in nums: " + iob.min());
        System.out.println("Max value in chs: " + ch.max());
        System.out.println("Max value in chs: " + ch.min());
    }
}

