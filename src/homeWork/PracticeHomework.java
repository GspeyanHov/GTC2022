package homeWork;

public class PracticeHomework {

    // 1.փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

    long convert(int minutes) {
        long seconds = 60 * minutes;
        System.out.println("seconds = " + seconds);
        return seconds;
    }

    // 2.ընդունել տարին, վերադարձնել օրերի քանակը։

    int calcAge(int years) {
        int days = 365 * years;
        System.out.println("days = " + days);
        return days;
    }

    // 3.վերադարձնել տրված թվի հաջորդ թիվը

    int nextNumber(int number) {
        System.out.println("after " + number + " is " + ++number);
        return number;
    }

    // 4.վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    boolean isSameNum(int a, int b) {
        if (a == b) {
            System.out.println("a and b are equal: " + true);
        } else {
            System.out.println("a and b are not equal: " + false);
        }
        return false;
    }

      /* 5.վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
           մնացած դեպքերում վերադարձնել false   */

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            System.out.println("number less or equal to zero: " + true);
            return true;
        } else {
            System.out.println("number bigger than zero: " + false);
            return false;
        }
    }


    // 6.վերադարձնել ընդունող բուլյանի ժխտված արժեքը։

    boolean reverseBool(boolean value) {
        boolean isDenied = !value;
        System.out.println("boolean's denied value: " + isDenied);
        return false;
    }


    // 7.վերադարձնել երկու մասիվի ամենամեծ length-ը

    int maxLength(int[] array1, int[] array2) {
      if(array1.length > array2.length){
          System.out.println("array1's length is bigger and equals: " + array1.length);
      }else{
          if(array1.length < array2.length){
              System.out.println("array2's length is bigger and equals: " + array2.length);
          }else{
              System.err.println("error: array's length's are equal! ");
          }
      }
        return -1;
    }


    void print() {
        System.out.println("---------------------------");
        return;
    }

    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();

        ph.convert(20);
        ph.print();

        ph.calcAge(10);
        ph.print();

        ph.nextNumber(6);
        ph.print();

        ph.isSameNum(5, 5);
        ph.print();

        ph.isSameNum(10, 15);
        ph.print();

        ph.lessThanOrEqualToZero(-20);
        ph.print();

        ph.lessThanOrEqualToZero(15);
        ph.print();

        ph.reverseBool(true);
        ph.print();

        ph.maxLength(new int[10], new int[30]);


    }
}
