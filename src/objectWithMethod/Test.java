package objectWithMethod;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//-----------object as a parameter----------
//		Scanner sc = new Scanner(System.in);
//		Student s = new Student();
//		System.out.println("Student Id:");
//		s.setId(sc.nextInt());
//		s.setId(23);
//		s.setFname("Shree");
//		s.setLname("yonzon");
//		s.setCollege("MBM");
//		s.setAge(25);
		
		Test t = new Test();
		t.getStudentData();
		Student s = t.getStudentData();
		t.printStudent(s);
		
		
		
	}
	
	//-------------object as a parameter----------
	void printStudent(Student s) {
		System.out.println("Id: "+s.getId());
		System.out.println("FirstName: "+s.getFname());
		System.out.println("LastName: "+s.getLname());
		System.out.println("College: "+s.getCollege());
		System.out.println("Age: "+s.getAge());
	}
	
	
	//---------------object as a return type---------------
	
	Student getStudentData() {
		Student s = new Student();
		s.setId(23);
		s.setFname("Shree");
		s.setLname("yonzon");
		s.setCollege("MBM");
		s.setAge(25);
		
		return s;
	}
}
