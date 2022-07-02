package homeWork.books.storage;

import homeWork.books.model.Book;

public class BookStorage {

    private static Book[] array = new Book[10];
    private static int size = 0;

    public static Book printBookByAuthorName(String authorName) {
        Book b  = null;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(authorName)) {
                System.out.println(i + ". " + array[i]);
                b = array[i];
            }
        }
        return b;
    }

    public static Book printBookByGenre(String genre) {
        Book b = null;
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(i + ". " + array[i]);
                b = array[i];
            }
        }
        return b;
    }

    public static Book priceRange(double from, double to) {
        Book b = null;
        for (int i = 0; i < size ; i++) {
            if (array[i].getPrice() >= from && array[i].getPrice() <= to) {
                System.out.println(i + ". " + array[i]);
                b = array[i];
            }
        }
        return b;
    }


    //    public Student getByIndex(int index) {
//        if (index >= size || index < 0) {
//            return null;
//        }
//        return array[index];
//    }
//
    private void extend() {
        Book[] book = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            book[i] = array[i];
        }
        array = book;
    }

    public void add(Book book) {
        if (array.length == size) {
            extend();
        }
        array[size++] = book;
    }

    public static void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

//
//    public void delete(int index) {
//        if (index >= size || index < 0) {
//            System.out.println("Error array index! ");
//            return;
//        }
//        Book book = array[index];
//        for (int i = index; i < size - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        size--;
//
//    }
//
//    public static int getSize() {
//        return size;
//    }
}
