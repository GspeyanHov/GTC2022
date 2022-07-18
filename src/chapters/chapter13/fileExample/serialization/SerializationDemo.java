package chapters.chapter13.fileExample.serialization;

import java.io.*;

public class SerializationDemo {

    public static final String NEW_PATH = "D:\\Users\\JetBrains\\IdeaProjects\\GTC2022\\src\\chapters\\chapter13\\fileExample\\serialization\\file\\newExample.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("Poxos", "Poxosyan",35,"poxos@mail.ru");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(NEW_PATH));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(NEW_PATH));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);
    }
}
