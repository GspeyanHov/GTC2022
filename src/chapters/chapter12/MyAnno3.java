package chapters.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {
    String str() default "testing";
    int val() default 9000;

}

class Meta3{

    @MyAnno3
    public static void myMeth() {
        Meta3 ob = new Meta3();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno3 anno = m.getAnnotation(MyAnno3.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException esc){
            System.out.println("Method not found ");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
