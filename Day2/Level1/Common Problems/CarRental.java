public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double cost;
    CarRental(){
        customerName = "No customer";
        carModel = "no model";
        rentalDays = 0;
        int price =0;
         cost = rentalDays*price;
        
    }
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel= carModel;
        this.rentalDays = rentalDays;
         cost = rentalDays*400;
        
    }

    void display(){
        System.out.println("The customer name is " +customerName);
        System.out.println("The model of the car is " +carModel);
        System.out.println("The rental days of the car is " +rentalDays);
        System.out.println("The cost of the car is " +cost);
    }
    public static void main(String[] args) {
        CarRental car1 = new CarRental();
        car1.display();
        CarRental car2 = new CarRental("shreya", "maruti800", 12);
        car2.display();
    }
}
