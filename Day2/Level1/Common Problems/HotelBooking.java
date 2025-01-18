public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName = "No guests";
        roomType = "Normal";
        nights =0;
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking booking){
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }
    void display(){
        System.out.println("The guestname is " +guestName);
        System.out.println("The room type of the guest is " +roomType);
        System.out.println("The number of nights of guest is " +nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.display();
        HotelBooking booking2 = new HotelBooking("Shreya", "Deluxe", 18);
        booking2.display();
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.display();
    }
}
