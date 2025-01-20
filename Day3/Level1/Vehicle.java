package Level1;

import java.sql.SQLOutput;

public class Vehicle {
    //A static variable registrationFee common for all vehicles.
    static int registrationfee = 2000;
    String ownerName;
    String vehcileType;
    final int registrationNumber;

    public Vehicle(int registrationNumber, String ownerName, String vehcileType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehcileType = vehcileType;
    }
    //A static method updateRegistrationFee() to modify the fee.
    static void updateRegistrationFee(){
        registrationfee = 7000;
        System.out.println("registrationfee :" +registrationfee);
    }
    void display(){
        System.out.println("ownername :" +ownerName);
        System.out.println("registrationnumber :" +registrationNumber);
        System.out.println("vehicletype :" +vehcileType);
    }

    public static void main(String[] args) {
       Vehicle car = new Vehicle(18765, "anuj", "car");
       car.display();
       Vehicle.updateRegistrationFee();
       //Check if an object belongs to the Vehicle class before displaying its registration details.
        if(car instanceof Vehicle){
            System.out.println("car is an instance of Vehicle");
        }
        else{
            System.out.println("car is not an instance of Vehicle");
        }
    }
}
