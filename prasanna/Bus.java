package prasanna;

public class Bus {
  private int busNo;
  private boolean ac;
  private int capacity;
  
  
  public void displayBusInfo(){
	    System.out.println(" Bus " + busNo + " ac " + ac +" capacity " + capacity );
	  }
  
  
  Bus(int no,boolean ac,int cap){
  
    this.busNo=no;
    this.ac=ac;
    this.capacity=cap;
  }
  
  public int getBusNo() {
    return busNo;
  }
  
  public boolean isAc() {
    return ac;
  }
  
  public int getCapacity(){ //get or accessor method
    return capacity;
  }
  public void setAc(boolean val) {
    ac=val;
  }
  
  public void setCapacity(int cap) { //set or mutator method
    capacity=cap;
    
  }
  

}