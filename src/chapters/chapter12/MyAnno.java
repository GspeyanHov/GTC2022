package chapters.chapter12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    String str();
    int val();
}

class Meta{

    @MyAnno(str  = "Annotation example ", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException esc){
            System.out.println("method not found. ");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}


