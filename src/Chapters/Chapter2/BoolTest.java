package Chapters.Chapter2;

public class BoolTest {

    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("b equals " + b);

        b = true;
        System.out.println("b equals " + b);

        if (b) {
            System.out.println("This code is running");
            b = false;
        }
        if (b) {
            System.out.println("This code is not running");

        }
        System.out.println("10 > 9 equals " + (10 > 9));
    }
}

