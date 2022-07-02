package homeWork.books;

import homeWork.books.storage.AuthorStorage;
import homeWork.books.storage.BookStorage;
import homeWork.books.commands.Commands;
import homeWork.books.model.Author;
import homeWork.books.model.Book;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner sc = new Scanner(System.in);
    private static BookStorage bs = new BookStorage();
    private static AuthorStorage as = new AuthorStorage();

    public static void main(String[] args) {

        Author Voynich = new Author("Ann", "Voynich", "voy@hotmail.com", "female");
        Author Tolstoy = new Author("Ivan", "Tolstoy", "tol@hotmail.com", "male");
        Author Pushkin = new Author("Alex", "Pushkin", "push@hotmail.com", "male");
        as.add(Voynich);
        as.add(Tolstoy);
        as.add(Pushkin);
        bs.add(new Book("Black and White", Voynich, 13.2, 3, "historical"));
        bs.add(new Book("Straps", Tolstoy, 10.5, 3, "detective"));
        bs.add(new Book("Anegin", Pushkin, 13.2, 3, "dramatic"));


        boolean run = true;
        while (run) {
            Commands.commands();

            int command = Integer.parseInt(sc.nextLine());

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOKS:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    printAllBooks();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthors();
                    break;
                case PRINT_ALL_AUTHORS:
                    AuthorStorage.printArray();
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }
    }

    private static void addAuthors() {
        System.out.println("please input author's name ");
        String authorName = sc.nextLine();
        System.out.println("please input author's surname ");
        String surName = sc.nextLine();
        System.out.println("please input author's email ");
        String email = sc.nextLine();
        System.out.println("please input author's gender ");
        String gender = sc.nextLine();

        Author author = new Author("name", "teacherName", "email", "gender");
        as.add(author);
        System.out.println("Author created! ");

    }


    private static void printBooksByPriceRange() {
        BookStorage.printArray();
        System.out.println("Please input book's price range ");
        double priceRangeFrom = Double.parseDouble(sc.nextLine());
        double priceRangeTo = Double.parseDouble(sc.nextLine());
        check(priceRangeFrom, priceRangeTo);
    }

    private static void check(double priceRangeFrom, double priceRangeTo) {
        Book b = BookStorage.priceRange(priceRangeFrom, priceRangeTo);
        if (b == null) {
            System.out.println("Wrong price!.Please input correct price range!!! ");
            priceRangeFrom = Double.parseDouble(sc.nextLine());
            priceRangeTo = Double.parseDouble(sc.nextLine());
            BookStorage.priceRange(priceRangeFrom, priceRangeTo);
        }
    }

    private static void printBooksByGenre() {
        BookStorage.printArray();
        System.out.println("please input book's genre's name ");
        String genre = sc.nextLine();
        Book b = BookStorage.printBookByGenre(genre);
        if (b == null) {
            System.out.println("Wrong genre!. Please input correct genre!!!");
            genre = sc.nextLine();
            BookStorage.printBookByGenre(genre);
        }
    }

    private static void printBookByAuthorName() {
        BookStorage.printArray();
        System.out.println("please input book's author's name ");
        String name = sc.nextLine();
        Author author = AuthorStorage.printBookByAuthorName(name);
        if (author == null) {
            System.out.println("Wrong author name!. Please input correct author name!!!");
            name = sc.nextLine();
            printBookByAuthorName();
        }
    }

    private static void printAllBooks() {
        BookStorage.printArray();
        System.out.println("book created ");
    }

    private static void addBooks() {
        if (AuthorStorage.getSize() != 0) {
            AuthorStorage.printArray();
            System.out.println("Please choose author's index! ");
            int index = Integer.parseInt(sc.nextLine());
            Author author = as.getByIndex(index);
            if (author == null) {
                System.out.println("Wrong index!. Please choose correct index ");
                addBooks();
            } else {
                System.out.println("Please input book's title ");
                String title = sc.nextLine();
                System.out.println("please input book's price ");
                String priceStr = sc.nextLine();
                System.out.println("please input book's count ");
                String countStr = sc.nextLine();
                System.out.println("please input book's genre ");
                String genre = sc.nextLine();

                double price = Integer.parseInt(priceStr);
                int count = Integer.parseInt(countStr);

                Book book = new Book("title", author, price, count, "genre");
                bs.add(book);
                System.out.println("book created ");
            }

        }


    }

}
