package prsk;

class Shape{
	int length;
	int breadth;
	int height;
	
	
	Shape(int l,int b,int h ){ //constructor
		length=l;
		breadth=b;
		height=h;
	}
	
	void setDim(int l,int b,int h) { // Don't return (method)
		length=l;
		breadth=b;
		height=h;

		
	}
	
	int volume() {
		return length*breadth*height;
		
	}
}
public class rasengan{
	public static void main(String args[]) {
		Shape a;
		a=new Shape(5,8,7);//Constructor (only for initialisation)
		a.setDim(9, 7, 5);// setDim method can be called anywhere -- here the second value has been taken for output and 
		//setDim method is used to change the given value
		System.out.println(a.volume());
	
		
		
		
		
		
		
		
	}
}


 
		 
		 
		 
	 
	



