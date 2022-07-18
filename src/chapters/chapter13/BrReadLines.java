package chapters.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class BrReadLines {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Enter lines of text ");
        System.out.println("Enter 'stop' to quite ");

        do{
            str = br.readLine();
            System.out.println(str);
        }
        while (!str.equals("stop"));
    }
}
