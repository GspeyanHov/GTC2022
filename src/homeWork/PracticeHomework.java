package homeWork;

public class PracticeHomework {

    // 1.փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

    long convert(int minutes) {
        return 60 * minutes;
    }

    // 2.ընդունել տարին, վերադարձնել օրերի քանակը։

    int calcAge(int years) {
        return 365 * years;
    }

    // 3.վերադարձնել տրված թվի հաջորդ թիվը

    int nextNumber(int number) {
        return ++number;
    }

    // 4.վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    boolean isSameNum(int a, int b) {
        return (a == b ? true : false);
    }

      /* 5.վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
           մնացած դեպքերում վերադարձնել false   */

    boolean lessThanOrEqualToZero(int number) {
        return (number <= 0 ? true : false);
    }


    // 6.վերադարձնել ընդունող բուլյանի ժխտված արժեքը։

    boolean reverseBool(boolean value) {
        return !value;
    }

    // 7.վերադարձնել երկու մասիվի ամենամեծ length-ը

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }

    void print() {
        System.out.println("---------------------------");
        return;
    }

    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();

        System.out.println(ph.convert(20));
        ph.print();

        System.out.println(ph.calcAge(10));
        ph.print();

        System.out.println(ph.nextNumber(6));
        ph.print();

        System.out.println(ph.isSameNum(5, 5));
        ph.print();

        System.out.println(ph.lessThanOrEqualToZero(-20));
        ph.print();

        System.out.println(ph.reverseBool(true));
        ph.print();

        System.out.println(ph.maxLength(new int[30], new int[40]));


    }
}
