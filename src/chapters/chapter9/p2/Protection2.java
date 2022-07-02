package chapters.chapter9.p2;

import chapters.chapter9.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.println("derived other package constructor ");

        // class or package only
        // System.out.println("n = " + n); error!

        // class only
        // System.out.println("n_pri = " + n_pri); error!

        System.out.println("n-pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
