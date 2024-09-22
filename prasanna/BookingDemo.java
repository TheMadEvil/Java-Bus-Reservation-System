package prasanna;
import java.util.Scanner;
import java.util.ArrayList;

public class BookingDemo{
  public static void main(String args[]) {
    
    ArrayList<Bus> buses=new ArrayList<Bus>();
    ArrayList<Booking> bookings =new ArrayList<Booking>();
    
    buses.add(new Bus(1,true,2));
    buses.add(new Bus(2,false,5));
    buses.add(new Bus(3,true,7));
    
    for(Bus b:buses) {
      b.displayBusInfo();
    }
    
     
    Scanner scanner=new Scanner(System.in);
    
    int UserInt=1;
    while(UserInt==1) {
    System.out.println("Enter 1 to book and 2 to exit");
    UserInt=scanner.nextInt();
    
    if(UserInt==1) {
      Booking booking = new Booking();
      if(booking.isAvailable(bookings,buses)) {
        bookings.add(booking);
        System.out.println("your booking is coonfirmed");
      }
      else
        System.out.println("sorry ...Bus is full.Try another bus or date");

    }
    }
    
    
  }
  
}