package chapters.chapter7;

import chapters.chapter6.Box;

public class Box1 {

        double width;
        double height;
        double depth;

        Box1(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        Box1() {
            width = -1;
            height = -1;
            depth = -1;
        }

        Box1(double len) {
            width = height = depth = len;
        }

        double volume() {
            return width * height * depth;
        }


        public static void main(String[] args) {
          Box1 myBox1 = new Box1(10,20,15);
          Box1 myBox2 = new Box1();
          Box1 myCube = new Box1(7);

          double vol;

          vol = myBox1.volume();
            System.out.println("Volume of myBox1 is: " + vol);

            vol = myBox2.volume();
            System.out.println("Volume of myBox2 is: " + vol);

            vol = myCube.volume();
            System.out.println("Volume of myCube is: " + vol);
        }
    }
