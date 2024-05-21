package oopAssignment;

public class Employees {
  int salary;
  int hourPerDay;
  
  
  void getInfo(int s, int h) {
  
	  System.out.println("the employee salary is :" +s);
	  System.out.println("number of hours of work per day of employee is :" +h);
	 
  }
  
  void addSal(int salary) {
	  if(this.salary<500) {
		  this.salary = salary +10;
		  System.out.println("Total salary is:" + this.salary);
	  }else {
		  System.out.println("total salary of  employee is:" +salary);
	  }
  }

  void addWork(int hourPerDay) {
	  if(this.hourPerDay>6) {
		  this.salary = salary +5;
		  
		  System.out.println("Total salary is:" + this.salary);
	  }else {
		  System.out.println("total  employee salary:" +this.salary);
	  }
  }
  
}
