package oopAssignment;

public class Average {
	
	//properties
	double num1;
	double num2;
	double num3;
	
	//default constructor
	public Average(double num1, double num2, double num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	//create method
	void calAvg() {
		
		double avg = (num1 + num2 + num3)/3;
		System.out.println("Total Average of three number is: " + avg);
	}

}
