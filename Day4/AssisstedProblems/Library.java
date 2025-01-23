package AssisstedProblems;

import java.util.ArrayList;
//Define a AssisstedProblems.Bank class and a AssisstedProblems.Customer class.
//Use an association relationship to show that each customer has an account in a bank.
//Implement methods that enable communication, such as openAccount() in the AssisstedProblems.Bank class and viewBalance() in the AssisstedProblems.Customer class.
class Book{
    private String title;
   private String author;
    Book(String title, String author){
        this.title= title;
        this.author= author;
    }
    public String getTitle(){
        return this.title = title;
    }
    public String getAuthor(){
        return this.author= author;
    }

}
public class Library {
    private String libraryName;
    private ArrayList<Book> books;
    Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book book){
        books.add(book);

    }

    public void displayDetails(){
        if(books.isEmpty())
            System.out.println("AssisstedProblems.Library is empty");
        System.out.println("The name of the library is :" +libraryName);

        for(Book book : books) {
            System.out.println("Title of the book is :" +book.getTitle());
            System.out.println("Author of the book is :" +book.getAuthor());

        }
    }


    public static void main(String[] args) {
        Book book1 = new Book("summer story", "samar");

        Library library=new Library("XYZ");
        library.addBook(book1);
        library.displayDetails();
    }
}
