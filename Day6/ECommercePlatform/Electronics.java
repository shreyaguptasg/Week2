package ECommercePlatform;
// Electronic
class Electronics extends Product implements Taxable {
    private double discountRate;
    private float taxRate;
    private double taxPrice;

    public Electronics(int productId, String name, double price, double discountRate, float taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    public void calculateTax(){
        this.taxPrice =  (getPrice() * taxRate) / 100;
    }

    @Override
    public double getTaxDetails(){
        return taxPrice;
    }

    @Override
    public double calculateDiscount(){
        return (getPrice() * discountRate) / 100;
    }
}