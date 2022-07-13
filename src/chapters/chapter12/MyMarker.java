package chapters.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker {
}
class Marker{

    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
         try{
             Method m = ob.getClass().getMethod("myMeth");
             if(m.isAnnotationPresent(MyMarker.class)){
                 System.out.println("MyMarker is present ");
             }
         }catch (NoSuchMethodException esc){
             System.out.println("Method not found ");
         }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
