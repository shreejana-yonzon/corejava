package oopAssignment;

public class Area {
	
	//properties
	 int length;
	 int breadth;
	 int Area;
	
	
	//first method 
	void setDim(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//second method
	void getArea() {
		int Area = length * breadth;
		System.out.println("Area of Rectangle : " + Area);
	}

}
