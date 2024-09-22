package kkkk;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter passenger name: ");
		passengerName=scanner.next();	
		System.out.println("enter BusNo: ");
		busNo=scanner.nextInt();
		System.out.println("Enter the date(dd-MM-yyyy): ");
		String dateInt=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public	boolean isAvailabe(ArrayList<Bus>buses,ArrayList<Booking>bookings) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity();
			}
	}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)){
				booked++;
			}
		}
		return capacity<booked?true:false;
}
	
		
		
		
	
	
	
	

}

