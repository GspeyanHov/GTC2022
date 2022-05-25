package homeWork.arrayutil;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = 0;
        int total = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                start++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i < spaceArray.length; i--) {
            if (spaceArray[i] == ' ') {
                end++;
            } else {
                break;
            }
        }
        total = spaceArray.length - (start + end);
        char[]result = new char[total];
        int x = 0;
        for (int i = start; i < spaceArray.length; i++) {
            while (x < result.length){
                result[x] = spaceArray[i];
                x++;
                break;
            }
        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}
