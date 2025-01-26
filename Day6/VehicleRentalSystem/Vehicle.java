package VehicleRentalSystem;
//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
abstract class  Vehicle {
    private String vehicleNumber;
    private String type;
    private int rentalRate;
    Vehicle(String vehicleNumber, String type, int rentalRate){
        this.vehicleNumber= vehicleNumber;
        this.type= type;
        this.rentalRate=rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public int getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(int rentalRate){
        this.rentalRate=rentalRate;
    }

    //Created an abstract method
    abstract public int calculateRentalCost(int days);
    //concrete method to display Vehcile details
    public void displayDetails(){
        System.out.println("Vehicle number : " +this.vehicleNumber);
        System.out.println("Type: " +this.type);
        System.out.println("Rental rate :" +this.rentalRate);
    }


}
