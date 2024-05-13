package oopAssignment;

public class TriangleWithParameter {

	private int side1;
	private int side2;
	private int side3;
	private double area;
	private int peri;
	
	 // Constructor with parameters to initialize the sides of the triangle
    public TriangleWithParameter( int side1 , int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //method to get area of triangle
    void getAreaTriangle() {
    	double s = (side1 +side2 +side3)/2;
    	double area = Math.sqrt( s *(s - side1) *(s - side2) *(s - side3));
    	System.out.println("Area of triangle: " +area);
    }
    
    void getPeri() {
    	int peri = side1 + side2 + side3;
    	System.out.println("Perimeter of Triangle: " +peri);
    }
}
