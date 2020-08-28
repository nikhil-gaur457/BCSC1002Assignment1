/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */

package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    // Non-Parameterized Constructor Method
    public Student(){
        this.namesOfTheBooksIssuedByTheStudent = new Book[4];
        for (int i = 0; i < namesOfTheBooksIssuedByTheStudent.length; i++) {
            namesOfTheBooksIssuedByTheStudent[0] = new Book();
            namesOfTheBooksIssuedByTheStudent[1] = new Book("Book" + (i+1));
            namesOfTheBooksIssuedByTheStudent[2] = new Book("Book","Author");
            namesOfTheBooksIssuedByTheStudent[3] = new Book("Clean Code", "Uncle Bob", "325mngt1029bo");
        }
    }

    // Parameterized Constructor Method
    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent, int numberOfBooksIssuedByTheStudent, Book[] namesOfTheBooksIssuedByTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    /** This method will allow the student to return the book.
     *
     * @param name The name of the book that Student want to return.
     */
    public static void doReturn(String name) {
        System.out.println("Thanks for returning the book of " + "'" + name + "'.");
    }

    // Getter() - Setter() method
    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Book[] getNamesOfTheBooksIssuedByTheStudent() {
        return namesOfTheBooksIssuedByTheStudent;
    }

    public void setNamesOfTheBooksIssuedByTheStudent(Book[] namesOfTheBooksIssuedByTheStudent) {
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    // toString()
    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNumberOfTheStudent=" + universityRollNumberOfTheStudent +
                ", numberOfBooksIssuedByTheStudent=" + numberOfBooksIssuedByTheStudent +
                ", namesOfTheBooksIssuedByTheStudent=" + Arrays.toString(namesOfTheBooksIssuedByTheStudent) +
                '}';
    }


    // equals() method and hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getUniversityRollNumberOfTheStudent() == student.getUniversityRollNumberOfTheStudent() &&
                getNumberOfBooksIssuedByTheStudent() == student.getNumberOfBooksIssuedByTheStudent() &&
                Objects.equals(getNameOfTheStudent(), student.getNameOfTheStudent()) &&
                Arrays.equals(getNamesOfTheBooksIssuedByTheStudent(), student.getNamesOfTheBooksIssuedByTheStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfTheStudent(), getUniversityRollNumberOfTheStudent(), getNumberOfBooksIssuedByTheStudent());
        result = 31 * result + Arrays.hashCode(getNamesOfTheBooksIssuedByTheStudent());
        return result;
    }

    /**
     * This method will allow the Student for issue the book.
     *
     * @param name The name of the new book to be issued.
     */

    public void addBook(String name) {
        System.out.println("\"" + name + "\" book is issued.");
    }

    /**
     * This method will print all the books that was issued by Student or
     * the elements of the 'namesOfTheBooksIssuedBYTheStudent' array.
     */
    public void listOfIssuedBooks() {
        for (Book book : this.namesOfTheBooksIssuedByTheStudent) {
            System.out.println(book);
        }
    }
}