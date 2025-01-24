package HybridInheritance;
//Define a superclass Vehicle with attributes like maxSpeed and model.
class Vehicle1{
    protected int maxSpeed;
    protected String model;
    Vehicle1(int maxSpeed, String  model){
        this.maxSpeed= maxSpeed;
        this.model= model;
    }
}
//Create an interface Refuelable with a method refuel().
interface  Refuelable{
    public void refuel();
}
//Define subclasses PetrolVehicle. PetrolVehicle should implement Refuelable
class PetrolVehicle extends Vehicle1 implements Refuelable{
    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed,model);
    }
    public void refuel(){
        System.out.println("Petrol vehicle is refueling");
    }
}
//Define subclasses ElectricVehicle and it should implement charge() method.
class ElectricVehicle extends Vehicle1{
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed,model);
    }
    public void charge(){
        System.out.println("Electric vehicle is charging");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        //creating objects of subclass
        PetrolVehicle petrolVehicle= new PetrolVehicle(70,"Honda");
        ElectricVehicle electricVehicle = new ElectricVehicle(80, "OLA");
        //calling out their respective methods
        petrolVehicle.refuel();
        electricVehicle.charge();
    }
}
