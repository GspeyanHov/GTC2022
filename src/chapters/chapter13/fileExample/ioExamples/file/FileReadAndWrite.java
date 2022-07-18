package chapters.chapter13.fileExample.ioExamples.file;

import java.io.*;

public class FileReadAndWrite {

    public static final String FILE_PATH1 = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\chapters\\chapter13\\fileExample\\ioExamples\\file\\textExample.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH1))) {
            bw.write("Hello from java \n");
            bw.write("Hello from java Line 2 !!!!!!!!");
        }
    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH1))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("acount = " + aCount);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
