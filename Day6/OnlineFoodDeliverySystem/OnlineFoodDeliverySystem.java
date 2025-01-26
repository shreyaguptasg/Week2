package OnlineFoodDeliverySystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating objects for VegItem and NonVegItem classes
        FoodItem item1=new VegItem("Dosa",120,2);
        FoodItem item2=new NonVegItem("Biryani",300,1);
        // performing operation
        item1.applyDiscount(10);
        item2.applyDiscount(8);
        int extraChargeOnVegFood=20;
        int extraChargeOnNonVegFood=50;
        item1.calculateTotalPrice(extraChargeOnVegFood);
        item2.calculateTotalPrice(extraChargeOnNonVegFood);
        item1.getItemDetails();
        item2.getItemDetails();


    }
}
