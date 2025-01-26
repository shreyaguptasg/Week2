package VehicleRentalSystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("mp041234","car",5200,6);
        Vehicle bike = new Bike("mp98309843", "bike", 900, 11);
        Vehicle truck = new Truck("4789349","truck",8900,9);
        Car car1 = (Car) car;
        Truck truck1 =(Truck) truck;
        Bike bike1 = (Bike) bike;
        Vehicle[] vehicles= {car, truck, bike};
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.calculateRentalCost(6));
            vehicle.displayDetails();
        }
        car1.getInsuranceDetails();
        truck1.getInsuranceDetails();
        bike1.getInsuranceDetails();
    }
}
