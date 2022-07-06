package homeWork.books.storage;

import homeWork.books.exception.AuthorNotFoundException;
import homeWork.books.model.Author;

public class AuthorStorage {

    private static Author[] array = new Author[10];
    private static int size = 0;

    public void printBookByAuthorName(String name, String surname) {
        boolean exists = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(name) && array[i].getName().equals(surname)){
                System.out.println(i + ". " + array[i]);
                exists = true;
            }
        }
        if(!exists){
            System.out.println("No such author with that name!. Please try again! ");
        }
    }
    public void printAuthorByAuthorGender(String gender){
        boolean exists = false;
        for (int i = 0; i < size; i++) {
            if(array[i].getGender().equals(gender)){
                System.out.println(i + ". " + array[i]);
                exists = true;
            }
        }
        if(!exists){
            System.out.println("No such author with that gender!. Please try again! ");
        }
    }
    public void printAuthorByAuthorEmail(String email){
        boolean exists = false;
        for (int i = 0; i < size; i++) {
            if(array[i].getEmail().equals(email)){
                System.out.println(i + ". " + array[i]);
                exists = true;
            }
        }
        if(!exists){
            System.out.println("No such author with that email!. Please try again! ");
        }
    }
    public Author getByIndex(int index) throws AuthorNotFoundException {
        if (index >= size || index < 0) {
            throw new AuthorNotFoundException("Author with that " + index + "doesn't exist ");
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

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }
    public int getSize() {
        return size;
    }
}

