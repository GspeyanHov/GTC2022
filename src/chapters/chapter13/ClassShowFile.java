package chapters.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassShowFile {

    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename ");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException е) {

            System.out.println("Can nt open file ");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            }
            while (i != -1);
        } catch (IOException е) {
            System.out.println("Error: reading file");
            try {
                fin.close();
            } catch (IOException еsc) {
                System.out.println("Error: closing file ");
            }
        }
    }
}