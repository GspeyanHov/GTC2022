package chapters.chapter9.p2;

import chapters.chapter9.p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();
        System.out.println("other package constructor ");

        // class or package only
        // System.out.println("n = " + p.n);  error!

        // class only
        // System.out.println("n_pri = " + p.n_pri);  error!

        // class, subclass or package only
        // System.out.println("n_pro = " + n_pro);  error!

        System.out.println("n_pub = " + p.n_pub);
    }
}
