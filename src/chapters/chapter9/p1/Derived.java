package chapters.chapter9.p1;

import org.w3c.dom.ls.LSOutput;

public class Derived extends Protection {

    Derived() {
        System.out.println("Derived constructor ");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
    // class only
    // System.out.println("n_pri = " 4 + n_pri); error!
}
