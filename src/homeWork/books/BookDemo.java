package homeWork.books;

import homeWork.books.commands.Command;
import homeWork.books.exception.AuthorNotFoundException;
import homeWork.books.exception.UserNotFoundException;
import homeWork.books.model.Author;
import homeWork.books.model.Book;
import homeWork.books.model.Gender;
import homeWork.books.model.User;
import homeWork.books.storage.AuthorStorage;
import homeWork.books.storage.BookStorage;
import homeWork.books.storage.UserStorage;
import homeWork.students.model.UserType;

import java.util.Scanner;

public class BookDemo implements Command {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws AuthorNotFoundException, UserNotFoundException {
        dataInit();

        boolean run = true;
        while (run) {
            Command.loginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }
    }

    private static void login() {
        System.out.println("please input email,password for login ");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByUserEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exist! ");
        } else if (user.getPassword().equals(emailPassword[1])) {
            if (user.getUserType() == UserType.ADMIN) {
                loginAdmin();
            } else if (user.getUserType() == UserType.USER) {
                loginUser();
            }
        } else {
            System.out.println("Wrong password! ");
        }
    }

    private static void loginUser() {
        boolean run = true;
        while (run) {

            Command.UserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case PRINT_ALL_BOOKS:
                    printAllBooks();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_AUTHOR_BY_AUTHOR_GENDER:
                    printAuthorByAuthorGender();
                    break;
                case PRINT_AUTHOR_BY_AUTHOR_EMAIL:
                    printAuthorByAuthorEmail();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.printArray();
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }
    }

    private static void register() throws UserNotFoundException {
        System.out.println("Please input name,surname,email,password for register! ");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct data! ");
        } else {
            if (userStorage.getUserByUserEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("user created! ");
            } else {
                System.out.println("User with " + userData[0] + "already exist's! ");
            }
        }
    }

    private static void loginAdmin() {
        boolean run = true;
        while (run) {

            Command.adminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

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
                case PRINT_AUTHOR_BY_AUTHOR_GENDER:
                    printAuthorByAuthorGender();
                    break;
                case PRINT_AUTHOR_BY_AUTHOR_EMAIL:
                    printAuthorByAuthorEmail();
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
                    authorStorage.printArray();
                    break;
                default:
                    System.out.println("Invalid command! ");
                    break;
            }
        }
    }

    private static void dataInit() throws UserNotFoundException, AuthorNotFoundException {
        User user = new User("Martiros", "Martirosyan", "Marti@inbox.com", "admin", UserType.ADMIN);
        Author AnnVoynich = new Author("Ann", "Voynich", "voy@hotmail.com", Gender.FEMALE);
        Author LevTolstoy = new Author("Lev", "Tolstoy", "tol@hotmail.com", Gender.MALE);
        Author AlexPushkin = new Author("Alex", "Pushkin", "push@hotmail.com", Gender.MALE);
        userStorage.add(user);
        authorStorage.add(AnnVoynich);
        authorStorage.add(LevTolstoy);
        authorStorage.add(AlexPushkin);
        bookStorage.add(new Book("Black and White", AnnVoynich, 13.2, 3, "historical"));
        bookStorage.add(new Book("Straps", LevTolstoy, 10.5, 3, "detective"));
        bookStorage.add(new Book("Anegin", AlexPushkin, 13.2, 3, "dramatic"));
    }

    private static void printAuthorByAuthorEmail() {
        try {
            authorStorage.printArray();
            System.out.println("Please input author's email ");
            String email = scanner.nextLine();
            authorStorage.printAuthorByAuthorEmail(email);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid author's email ");
            printAuthorByAuthorEmail();

        }
    }

    private static void printAuthorByAuthorGender() {
        try {
            authorStorage.printArray();
            System.out.println("Please input author's gender ");
            String gender = scanner.nextLine();
            authorStorage.printAuthorByAuthorGender(Gender.valueOf(gender.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid author's gender! ");
            printAuthorByAuthorGender();
        }

    }

    private static void addAuthors() {
        try {
            System.out.println("please input author's name ");
            String authorName = scanner.nextLine();
            System.out.println("please input author's surname ");
            String surName = scanner.nextLine();
            System.out.println("please input author's email ");
            String email = scanner.nextLine();
            System.out.println("please input author's gender ");
            String gender = scanner.nextLine();

            Author author = new Author(authorName, surName, email, Gender.valueOf(gender.toUpperCase()));
            authorStorage.add(author);
            System.out.println("Author created! ");
        } catch (AuthorNotFoundException e) {
            System.out.println("Wrong author!. please choose correct author! ");
            addAuthors();
        }


    }


    private static void printBooksByPriceRange() {
        try {
            bookStorage.printArray();
            System.out.println("Please input book's minimum price");
            double minPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book's maximum price");
            double maxPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.printBooksByPriceRange(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("Invalid price try again");
            printBooksByPriceRange();
        }
    }

    private static void printBooksByGenre() {
        try {
            bookStorage.printArray();
            System.out.println("please input book's genre's name ");
            String genre = scanner.nextLine();
            bookStorage.printBookByGenre(genre);
        } catch (NullPointerException e) {
            System.out.println("Invalid genre name try again");
            printBooksByGenre();
        }

    }

    private static void printBookByAuthorName() {
        try {
            bookStorage.printArray();
            System.out.println("please input book's author's name ");
            String name = scanner.nextLine();
            System.out.println("please input book's author's surname ");
            String surname = scanner.nextLine();
            bookStorage.printBookByAuthorName(name, surname);
        } catch (NumberFormatException e) {
            System.out.println("Wrong author name or surname!. please try again ");
            printBookByAuthorName();
        }
    }

    private static void printAllBooks() {
        bookStorage.printArray();
        System.out.println("book created ");
    }

    private static void addBooks() {
        if (authorStorage.getSize() != 0) {
            authorStorage.printArray();
            System.out.println("Please choose author's index! ");
            Author author = null;
            try {
                int index = Integer.parseInt(scanner.nextLine());
                author = authorStorage.getByIndex(index);
                System.out.println("Please input book's title ");
                String title = scanner.nextLine();
                System.out.println("please input book's price ");
                String priceStr = scanner.nextLine();
                System.out.println("please input book's count ");
                String countStr = scanner.nextLine();
                System.out.println("please input book's genre ");
                String genre = scanner.nextLine();
                double price = Integer.parseInt(priceStr);
                int count = Integer.parseInt(countStr);
                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("book created ");
            } catch (AuthorNotFoundException | NumberFormatException e) {
                System.out.println("Wrong index!. Please choose correct index ");
                addBooks();
            }
        }
    }
}


