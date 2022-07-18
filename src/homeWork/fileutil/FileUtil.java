package homeWork.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    public static final String pathName = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\homeWork\\fileutil\\hov.txt";
    static File file = new File(pathName);

    public static void main(String[] args) throws IOException {
//     fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input fileDirectory");
        String path = file.getParent();
        path = scanner.nextLine();
        System.out.println("Please input file's name");
        String name = file.getName();
        name = scanner.nextLine();
        if (path.equals(file.getParent()) && name.equals(file.getName())) {
            System.out.println(file.exists());
        } else {
            System.out.println(false);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input filepath");
        String path = file.getParent();
        path = scanner.nextLine();
        System.out.println("Please input some keyword ");
        String keyword = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            String text = reader.readLine();
            boolean b = file.getName().endsWith(".txt");
            if (text.contains(keyword) && b) {
                System.out.println(file.getName());
            } else {
                System.out.println(false);
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input filepath");
        String txtPath = file.getPath();
        txtPath = scanner.nextLine();
        System.out.println("Please input some keyword ");
        String keyword = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            String text;
            int line = 0;
            while ((text = reader.readLine()) != null) {
                if (text.contains(keyword)) {
                    line++;
                    System.out.println(line + ": " + text);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input folder you want to calculate ");
        String path = file.getPath();
        path = scanner.nextLine();
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            int size = 0;
            for (File file1 : files) {
                size += file1.length();
                System.out.println(size);
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input folder you want to create file in ");
        String path = file.getPath();
        path = scanner.nextLine();
        System.out.println("Please input file name you want to create");
        String name = scanner.nextLine();
        System.out.println("Please input text content you want to write ");
        String content = scanner.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getName()));
        writer.write(content);
        writer.flush();

    }
}


