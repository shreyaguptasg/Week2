 public class Product{
    String productName;
    int price;
    static int  totalProducts =0;
   Product(String productName, int price){
    this.productName = productName;
    this.price = price;   
    totalProducts++;
   }
   void displayProductDetails(){
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
   }
   void  displayTotalProducts(){
    System.out.println("Total number of products: " + totalProducts);
   }


    public static void main(String[] args) {
        Product product = new Product("Shirt", 800);
        product.displayProductDetails();
        product.displayTotalProducts();
    }
}