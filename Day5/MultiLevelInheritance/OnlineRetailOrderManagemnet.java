package MultiLevelInheritance;
//Create a multilevel hierarchy to manage orders, where Order is the base class,
// ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
//Define a base class Order with common attributes like orderId and orderDate.
//Implement a method getOrderStatus() to return the current order status based on the class level.
class Order{
    protected String orderId;
    protected String orderDate;
    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus(){
        System.out.println("OrderId :" +this.orderId);
        System.out.println("OrderDate :" +this.orderDate);
    }
}
//Create a subclass ShippedOrder with additional attributes like trackingNumber.
class  ShippedOrder extends Order{
    protected int trackingNumber;
    ShippedOrder(String orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Shipping details are :");
        super.getOrderStatus();
        System.out.println("TrackingNUmber :" +this.trackingNumber);
   }
}
//Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
class DeliveredOrder extends ShippedOrder{
    protected String deliveryDate;
    DeliveredOrder(String orderId, String orderDate,int trackingNumber, String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
        }
        @Override
        public void getOrderStatus(){
            System.out.println("Delivering Details are :");
            super.getOrderStatus();
            System.out.println("Delivery Date :" +this.deliveryDate);
        }
}
public class OnlineRetailOrderManagemnet {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Order order = new Order("568788" , "24-01-2020");
        ShippedOrder shippedOrder = new ShippedOrder("3436565", "18-08-2024" , 674454549);
        DeliveredOrder deliveredOrder = new DeliveredOrder("4536453" , "24-01-2025", 65474, "3-02-25");
        //calling out their respective methods
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();

    }
}
