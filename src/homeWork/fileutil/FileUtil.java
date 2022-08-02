package homeWork.fileutil;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

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
        System.out.println("Please input filepath");
        String path = scanner.nextLine();
        System.out.println("Please input file's name");
        String name = scanner.nextLine();
        File file = new File(path, name);
        System.out.println(file.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input filepath");
        String path = scanner.nextLine();
        System.out.println("Please input some keyword ");
        String keyword = scanner.nextLine();
        findFiles(path, keyword);
    }

    static void findFiles(String path, String keyword) throws IOException {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] file = directory.listFiles();
            if (file != null) {
                for (File file1 : file) {
                    if (file1.isDirectory()) {
                        findFiles(file1.getAbsolutePath(), keyword);
                    } else {
                        if (file1.getName().endsWith(".txt")) {
                        }
                        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
                            String line = "";
                            while ((line = br.readLine()) != null) {
                                if (line.contains(keyword)) {
                                    System.out.println(file1.getAbsolutePath());
                                    break;
                                }
                            }
                        }
                    }
                }
            }

        } else {
            System.out.println("Please input correct path! ");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input filepath");
        String filePath = scanner.nextLine();
        System.out.println("Please input some keyword ");
        String keyword = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String text;
                int line = 1;
                while ((text = reader.readLine()) != null) {
                    if (text.contains(keyword)) {
                        text = text.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m");
                        System.out.println(line + ": " + text);
                    }
                    line++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input folder you want to calculate ");
        String folder = scanner.nextLine();
        File file = new File(folder);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            long size = 0;
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println("size of folder: " + size / 1024 + "kb");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input folder you want to create file in ");
        String directoryPath = scanner.nextLine();
        System.out.println("Please input file's name ");
        String fileName = scanner.nextLine();
        System.out.println("Please input content you want write in ");
        String content = scanner.nextLine();
        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile1 = new File(directory, fileName);
            if (!newFile1.exists()) {
                try {
                    newFile1.createNewFile();
                    try (BufferedWriter br = new BufferedWriter(new FileWriter(newFile1))) {
                        br.write(content);
                        System.out.println("File is ready ");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Please input correct directory ");
        }


    }
}


