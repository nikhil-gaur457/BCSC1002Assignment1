/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */

package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksThatAreCurrentlyAvailable;

    // Non-Parameterized Constructor Method
    public Library() {
        this.booksThatAreCurrentlyAvailable = new Book[5];
        for (int libraryIndex = 0; libraryIndex < booksThatAreCurrentlyAvailable.length; libraryIndex++) {
            booksThatAreCurrentlyAvailable[libraryIndex] = new Book();
        }
    }

    // Parameterized Constructor Method
    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    // Getter
    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    // Setter
    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    // toString()
    @Override
    public String toString() {
        return "Library{" +
                "booksThatAreCurrentlyAvailable=" + Arrays.toString(booksThatAreCurrentlyAvailable) +
                '}';
    }

    // equals() and hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }

    /**
     * this method will set the information of books in library
     */

    public void setBooksInLibrary() {
        booksThatAreCurrentlyAvailable[0].setNameOfTheBook("Head First Java");
        booksThatAreCurrentlyAvailable[0].setNameOfTheAuthorOfTheBook("Kathy Sierra & Bert Bates");
        booksThatAreCurrentlyAvailable[0].setThirteenDigitISBNNumberOfTheBook("55rtxz34519y0");
        booksThatAreCurrentlyAvailable[1].setNameOfTheBook("Effective Java");
        booksThatAreCurrentlyAvailable[1].setNameOfTheAuthorOfTheBook("Joshua Bloch");
        booksThatAreCurrentlyAvailable[1].setThirteenDigitISBNNumberOfTheBook("54mbdf45101zx");
        booksThatAreCurrentlyAvailable[2].setNameOfTheBook("Java");
        booksThatAreCurrentlyAvailable[2].setNameOfTheAuthorOfTheBook("Herbert Schildt");
        booksThatAreCurrentlyAvailable[2].setThirteenDigitISBNNumberOfTheBook("81rtnc58319Ao");
        booksThatAreCurrentlyAvailable[3].setNameOfTheBook("Database Management System");
        booksThatAreCurrentlyAvailable[3].setNameOfTheAuthorOfTheBook("Navathe");
        booksThatAreCurrentlyAvailable[3].setThirteenDigitISBNNumberOfTheBook("259bvh10023ma");
        booksThatAreCurrentlyAvailable[4].setNameOfTheBook("Engineering Mathematics 3");
        booksThatAreCurrentlyAvailable[4].setNameOfTheAuthorOfTheBook("H.K.Das");
        booksThatAreCurrentlyAvailable[4].setThirteenDigitISBNNumberOfTheBook("569jhy02351vq");
    }

    /**
     * This method will give the information of books available in library
     */

    public void availableBooks() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("|%-30s %-30s %-15s|\n", "Book Name", "Author's Name", "ISBN Number");
        System.out.println("--------------------------------------------------------------------------------");
        for (int libraryIndex = 0; libraryIndex < 5; libraryIndex++) {
            System.out.printf("|%-30s %-30s %-15s|\n", booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheAuthorOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getThirteenDigitISBNNumberOfTheBook());
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
}