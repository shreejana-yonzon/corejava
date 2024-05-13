package oopAssignment;

public class TestStudent {
public static void main(String[] args) {
	
	//creating object of student
	
	Student std = new Student();
	//object first
	std.name = "John";
	std.roll_no = 2;
	std.address = "Pepsicola";
	std.phone_number = 984678987;
	std.getInfoStd();//call method
	
	System.out.println("------------------------");
	//object second
	std.name = "Sam";
	std.roll_no = 4;
	std.address = "Anamnagar";
	std.phone_number = 984672387;
	std.getInfoStd();//call method
}
}
