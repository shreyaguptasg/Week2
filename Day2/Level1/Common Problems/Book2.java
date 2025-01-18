public class Book2 {
    String title;
    String author;
    int price;
    boolean availability;
    
    Book2(){
        title = "no title";
        author = "no author";
        price = 0;
        availability = true;
    }

    Book2(String title, String author, int price, boolean availability) {
        this.title= title;
        this.author =author;
        this.price= price;
        this.availability = availability;
        
    }


    void display(){
        System.out.println("title of the book is " +title);
        System.out.println("author of the book is " +author);
        System.out.println("price of the book is " +price);
        if(availability){
            availability = false;
            System.out.println("You can borrow the book");
        }
        else{
            System.out.println("you cannot borrow the book");
        }
        
    }

    
    public static void main(String[] args) {
        Book2 book = new Book2();
        book.display();
        Book2 book2 = new Book2("summer story", "Samar",200, true);
        book2.display();
        book2.display();

    }
}
