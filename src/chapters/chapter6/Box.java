package chapters.chapter6;

public class Box {

    double width;
    double height;
    double depth;

    //    void volume(){
//        System.out.print("Volume is ");
//        System.out.print(width * height * depth);
//    }
//    Box() {
//        System.out.println("Constructing the Box ");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }
    Box(double w, double h, double d){
         width = w;
         height = h;
         depth = d;
    }

    double volume() {
        return width * height * depth;
    }

//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }

}
