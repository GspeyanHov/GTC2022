package chapters.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

    @What(description = "An Annotation test class ")
    @MyAnno2(str = "Meta2", val = 99)

    class Meta2{

    public static void myMeth() {
        @What(description = "An Annotation test method ")
        @MyAnno2(str = "testing", val = 100)
        Meta2 ob = new Meta2();
            try{
                Annotation[]annos = ob.getClass().getAnnotations();
                System.out.println("All Annotations for Meta2: ");
                for (Annotation a : annos) {
                    System.out.println(a);
                }
                System.out.println();
                Method m = ob.getClass().getMethod("myMeth");
                annos = m.getAnnotations();
                System.out.println("All Annotations for myMeth: ");
                for (Annotation a : annos) {
                    System.out.println(a);
                }
            }catch (NoSuchMethodException esc){
                System.out.println("Method not found ");
            }
        }

        public static void main(String[] args) {
            myMeth();
        }
    }