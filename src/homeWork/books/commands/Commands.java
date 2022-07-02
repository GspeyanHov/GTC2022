package homeWork.books.commands;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOKS = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHORS = 7;

    static void commands(){
        System.out.println("Please input " + EXIT + " for exit ");
        System.out.println("Please input " + ADD_BOOKS + " for add books ");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books ");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print book by author name ");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print book by genre ");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print book by price range ");
        System.out.println("Please input " + ADD_AUTHOR + " for add authors ");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " for print all authors ");
    }

}
