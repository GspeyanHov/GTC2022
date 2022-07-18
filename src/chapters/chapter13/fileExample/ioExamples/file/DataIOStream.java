package chapters.chapter13.fileExample.ioExamples.file;

import java.io.*;

public class DataIOStream {

   public static final String FILE_PATH = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\chapters\\chapter13\\fileExample\\ioExamples\\file\\example.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(33);
        out.writeBoolean(false);

        out.close();
    }

    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());

        inputStream.close();
    }
}
