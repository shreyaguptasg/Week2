class Book{
    String title;
    String author;
    int price;
    
     Book(){
        title = "No Title";
        author = "No Author";
        price = 0;

    }  
    Book( String title, String author, int price){
       this.title = title;
       this.author = author;
       this.price = price;

    }  
    void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.displayBookDetails();
    Book book2 = new Book("the stranger things", "shreya", 400);
    book2.displayBookDetails();
  }
}