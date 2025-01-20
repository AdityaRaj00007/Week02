import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking() {
        System.out.println("You are in Default Constructor ");
    }
    // Parameterized Constructor Constructor to initialize details
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("You are in Parameterised Constructor ");
    }
     // Copy constructor
    HotelBooking(HotelBooking hb){
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
        System.out.println("You are in Copy Constructor ");
    }
    void display(){
        System.out.println("Guest name is " + guestName + " his RoomType is " + roomType + " will stay for " + nights + " Night");
    }
       
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Guest name ");
        String guestName = input.nextLine();

        System.out.println("Enter the RoomType ");
        String roomType = input.nextLine();

        System.out.println("Enter the Night he will Stay  ");
        int nights = input.nextInt();
     
        HotelBooking hb = new HotelBooking();
        HotelBooking hb1 = new HotelBooking(guestName, roomType, nights);
        hb1.display();
        HotelBooking hb2 = new HotelBooking(hb1);
        hb2.display();
        
        input.close();


    }
}
