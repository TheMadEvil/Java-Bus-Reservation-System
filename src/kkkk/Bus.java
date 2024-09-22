package kkkk;

public class Bus {
	private int BusNo;
	private boolean ac;
	private int capacity;
	
	
	Bus(int no,boolean ac,int cap){
		this.BusNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	
public void displayBusInfo() {
	System.out.println("Bus" + BusNo + " ac" + ac + "capacity" + capacity);
		
	}

public int getCapacity() {
	return capacity;
}
public void setCapacity(int cap) {
	capacity=cap;
	
}
public int getBusNo() {
	return BusNo;
}
public boolean getAc() {
	return ac;
}
public void setAc(boolean val) {
	ac=val;
}
	
	}
	
	
