package homeWork.books.storage;

import homeWork.books.model.Author;

public class AuthorStorage {

    private static Author[] array = new Author[10];
    private static int size = 0;

    public static Author printBookByAuthorName(String author) {
        Author a = null;
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(author)) {
                System.out.println(i + ". " + array[i]);
                a = array[i];
            }
        }
        return a;
    }
    public Author getByIndex(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return array[index];
    }

    private void extend() {
        Author[] authors = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            authors[i] = array[i];
        }
        array = authors;
    }

    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    public static void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }
    public static int getSize() {
        return size;
    }
}

