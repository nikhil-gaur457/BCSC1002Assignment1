/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.sql.SQLOutput;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String thirteenDigitISBNNumberOfTheBook;

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return nameOfTheAuthorOfTheBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    }

    public String getThirteenDigitISBNNumberOfTheBook() {
        return thirteenDigitISBNNumberOfTheBook;
    }

    public void setThirteenDigitISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    public Book(String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfTheBook = "Head First Java";
        this.nameOfTheAuthorOfTheBook = "Kathy Sierra & Bert Bates";
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    public void doCheckOut() {
        System.out.println("Enjoy... \"" + getNameOfTheBook() + "\".");
    }

    public void doReturn() {
        System.out.println("Enjoy... \"" + getNameOfTheBook() + "\".");
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
                ", thirteenDigitISBNNumberOfTheBook='" + thirteenDigitISBNNumberOfTheBook + '\'' +
                '}';
    }
}
