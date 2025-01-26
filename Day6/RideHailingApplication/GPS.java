package RideHailingApplication;
//Use an interface GPS with methods getCurrentLocation() and updateLocation().
public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
