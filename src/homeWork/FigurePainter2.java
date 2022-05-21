package homeWork;

public class FigurePainter2 {

    public static void main(String[] args) {

        /*

         * * * *
           * * *
             * *
               *
        */

        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        /*

          *
         * *
        * * *
       * * * *
        * * *
         * *
          *

         */
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 4 - i; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        /*. Այլ կերպ։

         *
        * *
       * * *
      * * * *
       * * *
        * *
         *

         */


        for (int i = 4 - 1; i > - 4; i--) {
            int k = i;
            if(i < 0){
                k = -i;
                }
                for (int j = 0; j < k + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 4 - k; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
