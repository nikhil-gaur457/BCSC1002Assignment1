/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */

package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_A_PREVIOUSLY_ISSUES_BOOK = 2;
    public static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student student = new Student();
        Library library = new Library();
        library.setBooksInLibrary();
        String bookName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter you choice between 1-4 : ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK:
                    scanner.nextLine();
                    System.out.println("Enter your name : ");
                    student.setNameOfTheStudent(scanner.nextLine());
                    System.out.println("Enter your University roll number : ");
                    student.setUniversityRollNumberOfTheStudent(scanner.nextLong());
                    System.out.println("number of books you want to issue");
                    student.setNumberOfBooksIssuedByTheStudent(scanner.nextInt());
                    System.out.println("Books available in library : ");
                    library.availableBooks();
                    scanner.nextLine();
                    System.out.println("Enter the name of the book for issue : ");
                    bookName = scanner.nextLine();
                    student.addBook(bookName);
                    break;
                case RETURN_A_PREVIOUSLY_ISSUES_BOOK:
                    if (student.getNumberOfBooksIssuedByTheStudent() == 0) {
                        System.out.println("You have issued no books");
                    } else {
                        System.out.println("Enter the name of the book that you previously issues : ");
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        Student.doReturn(bookName);
                    }
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    System.out.println("list of books issued by you : ");
                    student.listOfIssuedBooks();
                    break;
                case EXIT:
                    System.out.println("ThankYou for using our Services!");
                    break;
                default:
                    System.out.println("Sorry..!, You have Entered wrong choice.");
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
