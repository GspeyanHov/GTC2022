package chapters.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile1 {

    public static void main(String args[]) {
        int i;
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename ");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);

        } catch (FileNotFoundException е) {
            System.out.println("File not found.");
        } catch (IOException е) {
            System.out.println("An I/O error occurred ");
        }
    }
}
