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
        this.booksThatAreCurrentlyAvailable = new Book[10];
        for (int i = 0; i < booksThatAreCurrentlyAvailable.length; i++) {
            booksThatAreCurrentlyAvailable[i] = new Book();
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
}