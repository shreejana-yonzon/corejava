package oopAssignment;

public class InputArea {
	
	//properties 
	int length;
	int breadth;
	
	//create parameterized constructor 
	public InputArea(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	//create method which returns area of rectangle
	void returnArea() {
		int area = length * breadth;
		System.out.println("Area of rectangle: " + area);
	}

}
