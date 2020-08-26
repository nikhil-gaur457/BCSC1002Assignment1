/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_A_PREVIOUSLY_ISSUES_BOOK = 2;
    public static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentChoice;
        String bookName;
        Student student = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter you choice between 1-4 : ");
            studentChoice = scanner.nextInt();
            switch (studentChoice) {
                case ISSUE_A_NEW_BOOK:
                    System.out.println("These are the books available in library : ");
                    break;
                case RETURN_A_PREVIOUSLY_ISSUES_BOOK:
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    break;
                case EXIT:
                System.out.println("ThankYou for using our Serivces!");
                break;
                default :
                    System.out.println("Sorry..!, You have Enterd wrong choice.");
                    break;
            }
        } while (EXIT != studentChoice);
        scanner.close();
    }
}
