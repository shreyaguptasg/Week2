package RideHailingApplication;

public class Auto extends  Vehicle implements GPS{
    private String currentLocation;
    private String update_Location;
    private static int fare = 1000;
    Auto(String vehicleId, String driverName, int ratePerKm, String currentLocation){
        super(vehicleId, driverName,ratePerKm);
        this.currentLocation=currentLocation;
    }
    //creating getter and setter methods for respective attributes
    public String getCurrent_Location(){
        return currentLocation;
    }

    public int getFare(){
        return fare;
    }

    @Override
    public void calculateFare(double distance) {
        double amount = getFare()*distance*getRatePerKm();
        System.out.println("Calculated fare :" + amount);

    }

    @Override
    public String getCurrentLocation() {
        return this.getCurrent_Location();
    }

    @Override
    public void updateLocation(String newLocation) {
        this.update_Location =newLocation;
        System.out.println("Updated location :" +this.update_Location);
    }
    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Current Location :" + this.getCurrentLocation());
        System.out.println("Fare : " + this.getFare() ) ;
    }
}
