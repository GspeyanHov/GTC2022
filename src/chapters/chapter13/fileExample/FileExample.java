package chapters.chapter13.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {

    static String filePath = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\chapters\\chapter13\\fileExample\\testFolder\\hello3.txt";
    static String newFilePath = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\chapters\\chapter13\\fileExample\\testFolder\\hello4.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
       boolean b = myFile.renameTo(new File(newFilePath));
        System.out.println(b);

//         System.out.println(myFile.exists());
//         if(!myFile.exists()){
//             myFile.createNewFile();
//             System.out.println(myFile.exists());
//
//
//         }
//        System.out.println("myFile isDirectory: " + myFile.isDirectory());
//        System.out.println("myFile isFile: " +myFile.isFile());
//        if(myFile.isDirectory()){
//            File[]files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//
//        }
    }
}
