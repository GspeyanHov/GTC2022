package chapters.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class BrRead {

    public static void main(String[] args) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quite. ");

        do {
            c = (char) br.read();
            System.out.println(c);
        }
        while(c != 'q');
    }

}
