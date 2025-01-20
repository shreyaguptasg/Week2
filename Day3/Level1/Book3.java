class Book3{
    //A static variable libraryName shared across all books
    static String libraryName = "ABC library";
    String title;
    String author;
    //Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
    final int isbn;
    Book3(String title, String author, int isbn){
        this.title= title;
        this.author= author;
        this.isbn = isbn;
    }
    //A static method displayLibraryName() to print the library name.
    static void displayLibraryName(){
        System.out.println("library Name is : " +libraryName);
    }


    public static void main(String [] args){
    Book3 book = new Book3("summer story", "Samar" ,12345);
    Book3.displayLibraryName();
    if(book instanceof Book3){
        System.out.println("book is an instance of Book3");
    }
    else{
        System.out.println("book is an not instance of Book3");
    }
    }
 }