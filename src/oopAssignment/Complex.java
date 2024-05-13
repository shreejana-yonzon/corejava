package oopAssignment;

public class Complex {

	//properties
	double num1;
	double num2;
	double i;
	
	//medthod for sum
	void  getSum() {
		
		double sum = num1 + (i*num2);
		System.out.println("The sum of two complex num is: " + sum);
	}
	//method for difference
    void  getDiff() {
		if(num2 > num1) {
			double diff =num2-num1;
			System.out.println("The sum of two complex num is: " + diff);
		}else {
			double diff = num1 - num2;
			System.out.println("The sum of two complex num is: " + diff);
		}
		
	}
//method for product
   void  getMul() {
	
	double mul = num1 * num2;
	System.out.println("The sum of two complex num is: " + mul);
}
}
