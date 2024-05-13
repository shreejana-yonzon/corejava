package oopAssignment;

public class Employee {

	//properties
	String name;
	int yearOfJoining;
	String address;
	
	//creating constructor
	public Employee(String name, int yearOfJoining, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	
	//method of name
	public String getName() {
		return name;
	}
	
	//method of year of joining
	public int yearofJoining() {
		return yearOfJoining;
	}
	
	//method of address
	public String getAddress() {
		return address;
	}
	public void employeeInfo() {
		System.out.println(name + "\t\t" + yearOfJoining + "\t\t\t" +address);
	}
	
}
