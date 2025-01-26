package ECommercePlatform;
import java.util.ArrayList;

public class ECommercePlatform {
    static double finalPrice(Product pd) {
                double price = pd.getPrice();

                double discount = pd.calculateDiscount();

                Taxable taxProduct = (Taxable) pd;
                taxProduct.calculateTax();
                double tax = taxProduct.getTaxDetails();

                System.out.println("Product price: " + price + "\nProduct discount: " + discount + "\nProduct tax: " + tax);

                return price + tax - discount;
            }
            public static void main(String[] args) {
                ArrayList<Product> pd = new ArrayList<>();
                Product et = new Electronics(123, "earphone", 700, 5, 10);
                Product ct = new Clothing(123, "Hoodie", 700, 5, 10);
                Product gc = new Groceries(123, "Apple", 100, 5, 10);
                pd.add(et);
                pd.add(ct);
                pd.add(gc);

                for (Product p: pd) {
                    System.out.println("Product name: " + p.getName());
                    System.out.println("Product final price: " + finalPrice(p) + "\n");
                }
    }
}


