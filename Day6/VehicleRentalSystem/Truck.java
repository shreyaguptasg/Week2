package VehicleRentalSystem;

 class Truck extends Vehicle implements Insurable{
    int days;
    int insuranceAmt =10000;
    Truck(String vehicleNumber, String type, int rentalRate, int days){
        super(vehicleNumber,type,rentalRate);
        this.days= days;

    }
    //overiding the Vehcile class method
    @Override
    public int calculateRentalCost(int days) {
        return days*getRentalRate();
    }
    //implementing methods of interface
    @Override
    public double calculateInsurance() {
        return insuranceAmt*days;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance details of car is :");
        System.out.println("Rental cost :" +this.calculateRentalCost(days));
        System.out.println("Calculated Insurance :" +this.calculateInsurance());


    }
}
