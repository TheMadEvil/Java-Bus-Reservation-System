package kkkk;
import java.util.Scanner;
import java.util.ArrayList;


public class busdemo {
	public static void main(String args[]) {
		
		ArrayList <Bus> buses = new ArrayList <Bus>();
		
		
		ArrayList <Booking> bookings = new ArrayList <Booking> ();
		
		
		
		buses.add(new Bus(1,true,7));
		buses.add(new Bus(2,false,5));
		buses.add(new Bus(3,true,4));
		
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		
		int UserOpt=1;
		Scanner scanner=new Scanner(System.in);
		
		
		while(UserOpt==1) {
		System.out.println("Enter 1 to book 2 to exit");
		UserOpt=scanner.nextInt();
		if(UserOpt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(buses,bookings)) {
				bookings.add(booking);
				System.out.println("booked");
			}
			else {
				System.out.println("not booked , try other bus or date ");
			}
		}
			
		
		
		
		
	}

}
	}
