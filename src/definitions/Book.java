/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String thirteenDigitISBNNumberOfTheBook;

    // Non-Parameterized Constructor Method for showing the book name and details.
    public Book() {
        this.nameOfTheBook = "Head First Java";
        this.nameOfTheAuthorOfTheBook = "Kathy Sierra & Bert Bates";
        this.thirteenDigitISBNNumberOfTheBook = "55rtxz34519y0";
    }

    // Parameterized Constructor Method
    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    // Getter()-Setter method
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

    /**
     * This method will allow the Student to take the book.
     */
    public void doCheckOut() {
        System.out.println("Enjoy... \"" + getNameOfTheBook() + "\".");
    }

    /**
     * This method will allow Student to return the book.
     */
    public void doReturn() {
        System.out.println("Thank for returning \"" + getNameOfTheBook() + "\".");
    }

    // The toString() method
    // It is used to convert the object to a string.

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
                ", thirteenDigitISBNNumberOfTheBook='" + thirteenDigitISBNNumberOfTheBook + '\'' +
                '}';
    }

    // The equals() method and hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return getNameOfTheBook().equals(book.getNameOfTheBook()) &&
                getNameOfTheAuthorOfTheBook().equals(book.getNameOfTheAuthorOfTheBook()) &&
                getThirteenDigitISBNNumberOfTheBook().equals(book.getThirteenDigitISBNNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getNameOfTheAuthorOfTheBook(), getThirteenDigitISBNNumberOfTheBook());
    }
}