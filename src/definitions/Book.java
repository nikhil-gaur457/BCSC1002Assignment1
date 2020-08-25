/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
