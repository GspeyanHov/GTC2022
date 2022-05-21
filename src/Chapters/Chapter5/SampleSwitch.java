package Chapters.Chapter5;

public class SampleSwitch {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i equals null");
                    break;
                case 1:
                    System.out.println("i equals one");
                    break;
                case 2:
                    System.out.println("i equals two");
                    break;
                case 3:
                    System.out.println("i equals three");
                    break;
                default:
                    System.out.println("i bigger than three");


            }
        }
    }
}
