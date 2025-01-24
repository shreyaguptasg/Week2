package AssistedProblems;
//Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("MaxSpeed :" +this.maxSpeed);
        System.out.println("FuelType :" +this.fuelType);
    }
}
//Define a subclass Car and with its attribute seatCapacity
class Car extends Vehicle{
    protected int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("Car attributes are :");
        super.displayInfo();
        System.out.println("SeatCapacity :" +this.seatCapacity);
    }
}
//Define a subclass Truck and with its attribute numberOfTyres
class Truck extends Vehicle{
    protected int numberofTyres;
    Truck(int maxSpeed, String fuelType, int numberofTyres){
        super(maxSpeed, fuelType);
        this.numberofTyres = numberofTyres;
    }
    @Override
    public void displayInfo(){
        System.out.println("Truck attributes are :");
        super.displayInfo();
        System.out.println("Number of Tyres :" +this.numberofTyres);
    }
}
//Define a subclass MotorCycle and with its attribute weight
class Motorcycle extends Vehicle{
    protected int weight;
    Motorcycle(int maxSpeed, String fuelType, int weight){
        super(maxSpeed, fuelType);
        this.weight = weight;
    }
    @Override
    public void displayInfo(){
        System.out.println("MotorCycle attributes are :");
        super.displayInfo();
            System.out.println("Weight :" +this.weight);
    }
}
public class VehicleTransportSystem {
    public static void main(String[] args) {
        //Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
         Vehicle car = new Car(180, "Petrol" ,5);
         Vehicle truck = new Truck(120, "Disesl",4);
         Vehicle motorcycle = new Motorcycle(150, "Petrol" ,60);

         Vehicle[] vehicles = {car, truck, motorcycle};
         for(Vehicle vehicle: vehicles){
             vehicle.displayInfo();

         }
    }
}
