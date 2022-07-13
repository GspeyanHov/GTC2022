package chapters.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {

    int value();
}
class Single{

    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        }catch (NoSuchMethodException esc){
            System.out.println("Method not found ");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
