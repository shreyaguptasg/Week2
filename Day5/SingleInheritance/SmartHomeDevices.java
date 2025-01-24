package SingleInheritance;
//Define a superclass Device with attributes like deviceId and status
//Implement a method displayStatus() to show each device's current settings.
class Device{
    protected  String deviceId;
    protected  String status;
    Device(String deviceId, String status){
        this.deviceId= deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("DeviceId :" +this.deviceId);
        System.out.println("Status :" +this.status);
    }
}
//Create a subclass Thermostat with additional attributes like temperatureSetting.
class Thermostart extends Device{
    protected int temperatureSetting;
    Thermostart(String deviceId, String status, int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting= temperatureSetting;
    }
    @Override
    public void displayStatus(){
        System.out.println("Thermametre Settings are : ");
        super.displayStatus();
        System.out.println("TemperatureSetting :" +this.temperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Device device = new Device("34545453", "working");
        Thermostart thermostart = new Thermostart("57866" , "not working" , 89);
        //calling out their respective methods
        device.displayStatus();
        thermostart.displayStatus();
    }
}
