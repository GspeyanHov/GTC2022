package chapters.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Repeatable(MyRepeatedAnnos.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno4 {
     String str() default "testing";
     int val() default 9000;
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
  MyAnno4[] value();
}
class RepeatAnno{
    @MyAnno4(str = "first annotation ", val = -1)
    @MyAnno4(str = "second annotation ", val = 100)

    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException esc){
            System.out.println("Method not found ");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
