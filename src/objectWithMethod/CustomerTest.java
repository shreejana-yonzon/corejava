package objectWithMethod;

public class CustomerTest {
public static void main(String[] args) {
	
	//to class printCustomer method
//	Customer c = new Customer();
//	c.setId(01);
//	c.setFname("Shree");
//	c.setLname("Yonzon");
//	c.setAddress("Mulpani");
//	c.setMobileNum(9841710513L);
	
	
	CustomerTest ct = new CustomerTest();
	Customer c = ct.getCustomerDetails();//to call getCustomerDetails method 
	ct.printCustomer(c);
}

//--------------------------------object as a parameter---------------------------------

void printCustomer(Customer c) {
	
	System.out.println("ID :" +c.getId());
	System.out.println("First Name :" +c.getFname());
	System.out.println("Last Name :" +c.getLname());
	System.out.println("Address :" +c.getAddress());
	System.out.println("Contact Number :" +c.getMobileNum());
}
//-------------------------------OBJECT AS A RETURN TYPE-------------------------------

Customer getCustomerDetails() {
	
	Customer c = new Customer();
	c.setId(01);
	c.setFname("Shree");
	c.setLname("Yonzon");
	c.setAddress("Mulpani");
	c.setMobileNum(975859559576L);
	return c;
}
}
