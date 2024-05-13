package oopAssignment;

public class Triangle {

	//properties
	int side1;
	int side2;
	int side3;
	
	// Method to calculate area of the triangle without parameter
    void getAreaOfTriangle() {
        double s = (side1 + side2 + side3) / 2;
        double area =  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println(" Area of Triangle : " + area);
    }
	
	//method to get perimeter of triangle without parameter
	void getPeriOftriangle() {
		int peri = side1 + side2 + side3;
		System.out.println("Perimeter of triangle: "+ peri);
	}
}
