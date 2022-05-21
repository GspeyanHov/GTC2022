package homeWork.arrayutil;

public class CharArrayExample {

    public static void main(String[] args) {

        // 1.Գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.println("....................................................................");
        char c = 'o';
        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                total++;
            }
        }
        System.out.println("How many 'c' variables are there in our array ?: --> " + total);
        System.out.println("...............................................................");

        // 2.Գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.println("The Two characters in the middle in the array: --> " +
                chars2[chars2.length / 2 - 1] + " | " + chars2[chars2.length / 2]);
        System.out.println("..............................................................");

        // 3.Տպել 'true' եթե մեր մասիվը վերջանում է 'ly'-ով, եթե ոչ՝ 'false':

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println("Print out 'true', if there are characters 'l' and 'y' in the" +
                    " end of our array: --> " + true);
        } else {
            System.out.println("Print out 'false', if there are not characters 'l' and 'y' in the" +
                    " end of our array: --> " + false);
        }
        System.out.println(".................................................................");

        // 4.Տպել 'true' եթե տեքստը պարունակում է 'bob' բառը, բայց 'o' -ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};

        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println("Print out 'true' if the text" +
                        " contains two 'b' characters, and between them can be any character: --> " + true);
            }
        }
        System.out.println("..................................................................");

        // 5.Տպել մասիվի այն սինվոլները որոնք բացատ չեն։

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        System.out.print("Print out the characters of the array that are not a 'space': --> ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
        System.out.println();
        System.out.println("...............................................................");
    }
}

