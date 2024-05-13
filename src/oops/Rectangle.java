package oops;

public class Rectangle {

	//properties
	public int l;
	public int b;
	public int Area;
	
	//passing value by arguments
	 public Rectangle(int l, int b) {
	        this.l = l;
	        this.b = b;
	    }



	
	
	//method
	void printArea() {
		int Area = l*b;
		System.out.println("Area:" + Area);
		
		
	}
}
