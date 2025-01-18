public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee;
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 5000;
    }
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    void updateRegistrationFee( int fee){
        registrationFee = fee;
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Shreya", "car");
        vehicle.displayVehicleDetails();
        vehicle.updateRegistrationFee(7000);
    }
}
