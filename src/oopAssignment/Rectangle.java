package oopAssignment;

public class Rectangle {
	
	//properties
	int length;
	int breadth;
	
	//constructor with parameter
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//method to print area
	void area() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

}
