package RideHailingApplication;
//Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
//Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private int ratePerKm;
    Vehicle(String vehicleId, String driverName, int ratePerKm){
        this.vehicleId= vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
    }
    //creating getter methods for respective attributes
    public String getVehicleId(){
        return vehicleId;
    }
    public String getDriverName(){
        return driverName;
    }
    public int getRatePerKm(){
        return ratePerKm;
    }
    //abstract method
    abstract public void calculateFare(double distance);

    //concrete methods
    public void getVehicleDetails(){
        System.out.println("Vehicle Id : " +this.getVehicleId());
        System.out.println("Driver Name : " + this.getDriverName());
        System.out.println("Rate per km : " + this.getRatePerKm());
    }

}
