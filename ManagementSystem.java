package library;

import java.awt.desktop.SystemHotkey;
import java.util.*;

public class ManagementSystem {
    private List<Book> books = List.of();
    private final List<Student> students;
    private Scanner sc;

    public ManagementSystem() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("\n-- Add New Book --");
        String id = UUID.randomUUID().toString();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Year: ");
        int year = Integer.parseInt(sc.nextLine());
    }

    public void showBookS() {
        System.out.println("\n--List Books--");
        if (books.isEmpty()) {
            System.out.println("\n-- Nothing Find--");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void updateBook() {
        System.out.println("\n-- Update any Book --");
        System.out.println("type the id to update the book: ");
        String idToUpdate = sc.nextLine();


        Book bookFind = null;
        for (Book book : books) {
            if (book.getId().equals(idToUpdate)){
                bookFind = book;
                break;
            }
        }

        if (bookFind!=null) {
            System.out.println("\nBook Find: " + bookFind);
            System.out.println("\nNew title (enter to continue): ");
            String newTitle = sc.nextLine();
            if (!newTitle.isEmpty()) {
                bookFind.setName(newTitle);
            }

            System.out.println("\nNew author (enter to continue): ");
            String newAuthor = sc.nextLine();
            if (!newAuthor.isEmpty()) {
                bookFind.setAuthor(newAuthor);
            }

            System.out.println("\nNew year (0 to continue): ");
            String yearStr = sc.nextLine();
            if (!yearStr.isEmpty() && Integer.parseInt(yearStr) != 0) {
                bookFind.setYear(Integer.parseInt(yearStr));
            }
            System.out.println("Book updated with sucess");
        }else {
            System.out.println("Book with ID " + idToUpdate + "not find");
        }
    }
   public void removeBook(){
       System.out.println("\n-- Remove Book --");
       System.out.println("Type the id to remove: ");
       String idToRemove = sc.nextLine();



   }
}
