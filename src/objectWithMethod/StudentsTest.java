package objectWithMethod;

import java.util.Scanner;

public class StudentsTest {
public static void main(String[] args) {
	//-------------------------RETURN ARRAY OF OBJECT-------------------
	// create array of object
	
	Students std[] = new Students[5];
	
	//write data in array
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i<std.length; i++) {
		
		//create object of class Students
		
		Students s = new Students();
		
	   System.out.println("Student ID :");
	   s.setId(sc.nextInt());
	   
	   System.out.println("First Name :");
	   s.setFname(sc.next());
	   
	   System.out.println("Last Name :");
	   s.setLname(sc.next());
	   
	   System.out.println("Faculty :");
	   s.setFaculty(sc.next());
	   
	   System.out.println("Roll No. :");
	   s.setRollNo(sc.nextInt());
	   
	   std[i] = s;
	   	
	}
	StudentsTest sTest = new StudentsTest();
	sTest.printAllStudents(std);
	
}
 void printAllStudents(Students[] slist) {
	
	for(Students st : slist ) {
		System.out.println(st);
	}
}

}