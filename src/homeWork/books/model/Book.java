package homeWork.books.model;

import homeWork.books.model.Author;

import java.util.Date;

import static homeWork.students.util.DateUtil.dateToString;

public class Book {

    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;
    private User registeredUser;
    private Date addedDate;

    public Book(String title, Author author, double price, int count,
                String genre, User registeredUser, Date addedDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.count = count;
        this.genre = genre;
        this.registeredUser = registeredUser;
        this.addedDate = addedDate;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Date getRegisteredDate() {
        return addedDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.addedDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", registeredUser='" + registeredUser + '\'' +
                ", registeredDate='" + dateToString(addedDate) + '\'' +
                '}';
    }
}
