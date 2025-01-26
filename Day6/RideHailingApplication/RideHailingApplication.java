package RideHailingApplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        //creating objects of subclasses by referencing superclass
        Vehicle car = new Car("mp046463", "Ramesh", 18,"Satna");
        Vehicle bike = new Bike("mp0587373","Rennu", 19, "Sagar");
        Vehicle auto = new Auto("mp0378587", "Raju", 20, "Rewa");
        //downcasting the objects to access interface methods
        Car newCar = (Car) car;
        Bike newBike= (Bike) bike;
        Auto newAuto = (Auto) auto;

        newCar.getCurrentLocation();
        car.getVehicleDetails();
        newCar.updateLocation("Maihar");
        car.calculateFare(89);
        bike.getVehicleDetails();
        newBike.getCurrent_Location();
        newBike.updateLocation("Bhopal");
        bike.calculateFare(90);
        auto.getVehicleDetails();
        newAuto.getCurrent_Location();
        newAuto.updateLocation("karnatka");
        auto.calculateFare(100);


    }

}
