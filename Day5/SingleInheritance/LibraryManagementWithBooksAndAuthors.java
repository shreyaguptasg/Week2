package SingleInheritance;
//Define a superclass Book with attributes like title and publicationYear.
//Create a method displayInfo() to show details of the book and its author.
class Book{
    protected String title;
    protected int pulicationYear;
    Book(String title, int pulicationYear){
        this.title= title;
        this.pulicationYear = pulicationYear;
    }
    public void displayInfo(){
        System.out.println("Title :" +this.title);
        System.out.println("PublicationYear :" +this.pulicationYear);
    }
}
//Define a subclass Author with additional attributes like name and bio.
class Author extends Book{
    protected String name;
    protected String bio;
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo(){
        System.out.println("Author details are :");
        super.displayInfo();
        System.out.println("Name :" +this.name);
        System.out.println("Bio :" +this.bio);
    }
}
public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", 2000);
        book.displayInfo();
        Author author = new Author("Summer Story" , 2020, "Samar" , "Rom-Com");
        author.displayInfo();
    }
}
