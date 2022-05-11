package Chapters.Chapter2;

public class IfSample {

    public static void main(String[] args) {
        int x;
        int y;

        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("X smaller than Y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("X now equals Y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("X now bigger than Y");
        }
        if (x == y) {
            System.out.println("You will not see it");
        }
    }
}
