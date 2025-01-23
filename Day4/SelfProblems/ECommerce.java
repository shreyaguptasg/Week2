package SelfProblems;
import java.util.ArrayList;
import java.util.concurrent.Callable;

class Order{
    private String orderId;
    ArrayList<Product> product;
    Order(String orderId){
        this.orderId = orderId;
        this.product = new ArrayList<>();
    }
    public String getOrderId(){
        return this.orderId;
    }
    public void addProduct(Product p){
        product.add(p);
    }
    public void displayProduct(){
        System.out.println("Product details are below mentioned:");
        if(product.isEmpty()){
            System.out.println("No products have been ordered yet");
        }
        else{
            for(Product products: product){
                System.out.println("product name :" +products.getProductName());
                System.out.println("product id :" +products.getProductId());
                System.out.println("availability of the product is " +products.getAvailabilty());
            }
        }
    }

}
class Customer{
    private String customerName;
    ArrayList<Order> order;
    Customer(String customerName){
        this.customerName = customerName;
        this.order = new ArrayList<>();
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void addOrder(Order orders){
        order.add(orders);
    }
    public void displayOrder(){
        System.out.println("Order details are below mentioned:");
        if(order.isEmpty()){
            System.out.println("No order for customer "  + this.customerName);
        }
        else{
            for(Order o1: order){
                System.out.println("Order name :" +o1.getOrderId());

            }
        }
    }


}
class Product{
    private String productName;
    private String productId;
    private boolean availability;
    Product(String productName, String productId, boolean availability){
        this.productName = productName;
        this.productId = productId;
        this.availability = availability;
    }
    public String getProductId(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }
    public boolean getAvailabilty(){
        return this.availability;
    }

}
public class ECommerce {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", "011PR23", true);
        Product product2 = new Product("Pant", "011PR14", true);
        Order order1 = new Order("011OL2345");
        Order order2 = new Order("0111Ol2389");
        Customer customer1 = new Customer("James");
        order1.addProduct(product1);
        order2.addProduct(product2);
        customer1.addOrder(order1);
        customer1.addOrder((order2));
        order1.displayProduct();
        order2.displayProduct();;
        customer1.displayOrder();


    }
}
